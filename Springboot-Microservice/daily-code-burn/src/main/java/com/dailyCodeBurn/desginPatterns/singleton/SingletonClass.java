package com.dailyCodeBurn.desginPatterns.singleton;

public class SingletonClass {

	private static SingletonClass singleClass = null;

	private SingletonClass() {} // make private constructor so that no one uses it to create new object again

	public static SingletonClass getInstance() {
		if(singleClass == null)  {
			synchronized(SingletonClass.class){
				if(singleClass == null) {
					singleClass = new SingletonClass();
				}
			}
		}
		
		return singleClass;
	}
}
