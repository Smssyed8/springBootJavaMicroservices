package com.dailyCodeBurn.desginPatterns.bridge;

public class Red implements Color{

	@Override
	public void myColorIs() {
		System.out.println("Red");
		
	}

	@Override
	public String sendColor() {
		// TODO Auto-generated method stub
		return "Red";
	}
}
