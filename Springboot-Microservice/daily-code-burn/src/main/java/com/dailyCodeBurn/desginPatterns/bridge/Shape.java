package com.dailyCodeBurn.desginPatterns.bridge;

public abstract class Shape {
	public static Color color = null;
	
	int x;
	Shape(Color color){
		this.color = color;
	}
	
	public abstract int calculateArea(int x) ;
	public abstract String getColor();
}
