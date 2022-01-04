package tollgate.service;

import java.time.LocalTime;

public interface TimeBasedFeeService {
    /**
     * get fee for given time
     * @return
     */
    double getFeeForTime(LocalTime time);
}
