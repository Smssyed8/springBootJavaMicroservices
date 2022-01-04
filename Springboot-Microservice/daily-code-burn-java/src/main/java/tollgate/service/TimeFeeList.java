package com.tollcalculator.service;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class TimeFeeList {

    private List<TimeFeeString> timeFeeList;

    @Data
    @NoArgsConstructor
    public static class TimeFeeString{
        private String start;
        private String end;
        private Double fee;
    }
}