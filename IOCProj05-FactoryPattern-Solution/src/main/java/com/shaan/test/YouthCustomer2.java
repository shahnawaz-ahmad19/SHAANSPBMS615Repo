package com.shaan.test;

import com.shaan.comp.BudgetCar;
import com.shaan.comp.Car;
import com.shaan.comp.SportsCar;
import com.shaan.factory.CarFactory;


public class YouthCustomer2 {
	public static void main(String[] args) {
		//get Car obj using factory
		Car car=CarFactory.createCar("sports", "TS08 EN 6688");
		car.drive();
		System.out.println("=====================");
		
	}

}
