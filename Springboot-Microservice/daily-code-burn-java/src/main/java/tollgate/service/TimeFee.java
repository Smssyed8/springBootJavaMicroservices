package com.tollcalculator.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TimeFee {

	private LocalTime startTime;
	private LocalTime endTime;
	private double fee;
	// defaulting to 18 is true
	private boolean isPeak;
}