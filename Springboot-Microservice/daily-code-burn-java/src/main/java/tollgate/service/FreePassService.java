package tollgate.service;

import java.time.LocalDate;


public interface FreePassService {

    boolean isFreeDay(LocalDate day);

    boolean isTollFreeVehicle(Vehicle vehicle);
}