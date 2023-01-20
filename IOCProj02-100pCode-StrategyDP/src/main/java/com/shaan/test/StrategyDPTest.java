package com.shaan.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shaan.Config.AppConfig;
import com.shaan.beans.Vehicle;

public class StrategyDPTest {
	
	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	    System.out.println("===================================");
		// get target class object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke methods
		vehicle.journey("Delhi", "London");
		//close container
		ctx.close();
		
	}

}
