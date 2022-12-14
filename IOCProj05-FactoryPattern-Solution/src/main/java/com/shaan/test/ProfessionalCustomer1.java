package com.shaan.test;

import com.shaan.comp.BudgetCar;
import com.shaan.comp.Car;
import com.shaan.factory.CarFactory;


public class ProfessionalCustomer1 {
	public static void main(String[] args) {
		//get Car obj using factory
				Car car=CarFactory.createCar("budget", "TS09  EN 5688");
				car.drive();
				System.out.println("=====================");
	}

}
