package com.tollcalculator.service;

import com.tollcalculator.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

import static com.tollcalculator.utils.constants.ServiceConstants.*;

@Service
public class TollFeeCalculatorImpl implements TollFeeCalculator {

    @Autowired
    private TimeBasedFeeService timeBasedFeeService;

    @Autowired
    private FreePassService freePassService;

   private boolean isValidData(Vehicle vehicle, LocalDateTime... dates) {
       if (null == vehicle) {
           throw new RuntimeException(INVALID_VEHICLE);
       }

       if (null == dates || dates.length == 0) {
           throw new RuntimeException(DATES_EMPTY);
       }

       if (freePassService.isTollFreeVehicle(vehicle)) {
           return false;
       }

       if (Arrays.stream(dates)
               .map(LocalDateTime::toLocalDate)
               .anyMatch(date -> !date.equals(dates[0].toLocalDate()))) {
           throw new RuntimeException(DIFFERENT_DATES);
       }
       if (freePassService.isFreeDay(dates[0].toLocalDate())) {
           return false;
       }
       return true;
    }
    /**
     * Calculate the total toll fee for one day
     *
     * @param vehicle - the vehicle
     * @param dates   - date and time of all passes on one day
     * @return - the total toll fee for that day
     */
    public int getTollFee(Vehicle vehicle, LocalDateTime... dates) {

        if(!isValidData(vehicle, dates)) return 0;

        // Considering Indian toll gate scenario, where there is no 0 fee on any time of day
        // thereby default is 8.
        Map<LocalTime, Double> map =  Arrays.stream(dates)
            .map(time ->  time.toLocalTime())
            .sorted()
            .distinct()
            .collect(
                Collectors.toMap(
                time -> time,
                time -> timeBasedFeeService.getFeeForTime(time)
            ));

        if (map.isEmpty()) {
            return 0;
        }

        Map.Entry<LocalTime, Double> entry = map.entrySet().iterator().next();
        LocalTime previousTime = entry.getKey(), nextTime = entry.getKey();
        double tmpFee = entry.getValue();
        double totalFee = tmpFee, nextFee = tmpFee;

        for (Map.Entry<LocalTime, Double> entryVal: map.entrySet()) {
            if(entryVal.getKey().equals(previousTime)){
                continue;
            }
            nextTime = entryVal.getKey();
            nextFee = entryVal.getValue();//tollTimeFeeService.getFee(nextTime);
            if(nextTime.isBefore(previousTime.plusMinutes(60))){
                if(nextFee > tmpFee){
                    tmpFee = nextFee;
                    totalFee = totalFee + tmpFee;
                }
            } else {
                tmpFee = nextFee;
                totalFee = totalFee + nextFee;
                previousTime = nextTime;
            }
            totalFee = totalFee + tmpFee;
            
            if (totalFee >= MAX_FEE) {
                return MAX_FEE;
            }
        }
        return Math.min(((int) totalFee), MAX_FEE); // check again
    }


}
