package com.shaan.test;

import com.shaan.comp.BudgetCar;
import com.shaan.comp.Car;
import com.shaan.comp.LuxuryCar;
import com.shaan.comp.SportsCar;
import com.shaan.factory.CarFactory;


public class BussinessManCustomer3 {
	public static void main(String[] args) {
		//get Car obj using factory
				Car car=CarFactory.createCar("luxury", "TS10 EN 5688");
				car.drive();
				System.out.println("=====================");
	
	}

}
