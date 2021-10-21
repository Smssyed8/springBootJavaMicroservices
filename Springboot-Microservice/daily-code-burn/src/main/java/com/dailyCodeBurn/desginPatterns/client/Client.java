package com.dailyCodeBurn.desginPatterns.client;

import org.springframework.boot.configurationprocessor.json.JSONException;

import com.dailyCodeBurn.desginPatterns.adapter.AdapterClass;
import com.dailyCodeBurn.desginPatterns.adapter.AdapterTarget;
import com.dailyCodeBurn.desginPatterns.adapter.EmployeeAdapteeImpl;
import com.dailyCodeBurn.desginPatterns.bridge.Red;
import com.dailyCodeBurn.desginPatterns.bridge.Shape;
import com.dailyCodeBurn.desginPatterns.bridge.Square;
import com.dailyCodeBurn.desginPatterns.decorator.CheeseDecoratorSandwich;
import com.dailyCodeBurn.desginPatterns.decorator.Sandwich;
import com.dailyCodeBurn.desginPatterns.decorator.WheatSandwich;
import com.dailyCodeBurn.desginPatterns.singleton.SingletonClass;

public class Client {

	public static void main(String[] args) {
		//decorator
		Sandwich s = new WheatSandwich();
		s = new CheeseDecoratorSandwich(s) ;
		System.out.println(s.calculatePrice());
		
		//bridge
		Shape shape = new Square(new Red());
		System.out.println(shape.getColor());

		//adapter
		AdapterTarget target = new AdapterClass(new EmployeeAdapteeImpl());
		System.out.println(target.getEmployees());
		
		//Singleton
		SingletonClass single = SingletonClass.getInstance();
		SingletonClass single2 = SingletonClass.getInstance();
		System.out.println(single);
		System.out.println(single2);
	}

}
