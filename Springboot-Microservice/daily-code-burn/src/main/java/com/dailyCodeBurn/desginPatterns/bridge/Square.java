package com.dailyCodeBurn.desginPatterns.bridge;

public class Square extends Shape{

	//Color color;
	public Square(Color color) {
		super(color);
		//this.color = color;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateArea(int x) {
		
		return x * x;
		
	}
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color.sendColor();
	}

}
