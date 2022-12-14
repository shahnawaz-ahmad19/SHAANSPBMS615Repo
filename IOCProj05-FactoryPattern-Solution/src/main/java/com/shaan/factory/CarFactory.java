package com.shaan.factory;

import com.shaan.comp.BudgetCar;
import com.shaan.comp.Car;
import com.shaan.comp.LuxuryCar;
import com.shaan.comp.SportsCar;


public class CarFactory {
	
	//Factory method having factory pattern logic (logic to create and return one of several related classes object)
	public static Car createCar(String type, String regNo) {
		if(type.equalsIgnoreCase("sports"))
			return new SportsCar(regNo);
		else if(type.equalsIgnoreCase("budget"))
			return new BudgetCar(regNo);
		else if(type.equalsIgnoreCase("luxury"))
			return new LuxuryCar(regNo);
		else
			throw new IllegalArgumentException("Invalid car Type");
	}

}
