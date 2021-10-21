package com.dailyCodeBurn.desginPatterns.adapter;

import org.springframework.boot.configurationprocessor.json.JSONObject;

public abstract class AdapterTarget {

	EmployeeAdaptee empAdaptee = null;

	AdapterTarget(EmployeeAdaptee empAdaptee){
		this.empAdaptee = empAdaptee;
	}
	
	public abstract JSONObject getEmployees();
}
