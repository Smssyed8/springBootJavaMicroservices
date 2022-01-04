package com.tollcalculator.service;

import com.tollcalculator.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;

public interface TollFeeCalculator {

    public int getTollFee(Vehicle vehicle, LocalDateTime... dates);
    //public int getTollFee(final Date date, Vehicle vehicle);

}