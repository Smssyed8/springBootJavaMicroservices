package com.dailyCodeBurn.desginPatterns.bridge;

public abstract class Rectangle extends Shape{

	Color color;
	Rectangle(Color color) {
		super(color);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calculateArea(int x) {	
		return x * x;
	}
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color.sendColor();
	}
	

}
