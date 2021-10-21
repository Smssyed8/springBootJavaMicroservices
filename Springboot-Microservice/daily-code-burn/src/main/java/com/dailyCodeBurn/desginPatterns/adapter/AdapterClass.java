package com.dailyCodeBurn.desginPatterns.adapter;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.json.JsonParser;

public class AdapterClass extends AdapterTarget {

	public AdapterClass(EmployeeAdaptee empAdaptee) {
		super(empAdaptee);
	}

	@Override
	public JSONObject getEmployees() {
		// TODO Auto-generated method stub
		//JSONParser parser = new JSONParser();  
		JSONObject json = new JSONObject();  
		try {
			json.put("emp", empAdaptee.getEmployees());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  json; //empAdaptee.getEmployees();
	}

}
