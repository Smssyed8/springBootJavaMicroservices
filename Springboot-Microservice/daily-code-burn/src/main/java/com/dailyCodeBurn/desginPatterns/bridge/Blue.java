package com.dailyCodeBurn.desginPatterns.bridge;

public class Blue implements Color{

	@Override
	public void myColorIs() {
		System.out.println("Blue");
		
	}

	@Override
	public String sendColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}
}
