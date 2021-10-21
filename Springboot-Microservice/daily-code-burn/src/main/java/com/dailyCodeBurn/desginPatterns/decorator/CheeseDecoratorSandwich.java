package com.dailyCodeBurn.desginPatterns.decorator;

public class CheeseDecoratorSandwich extends DecoratorSandwich{
	
	Sandwich s;
	
	public CheeseDecoratorSandwich(Sandwich s2) {
		this.s = s2;
	}

	@Override
	public int calculatePrice() {
		return s.calculatePrice() + 3;
	}
}
