package com.shaan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
// All spring beans are taken as final classes StrategyDP Rule#3
public final class Vehicle {
	@Autowired // For field level Dependency injection
	@Qualifier("engineType") //works becoz engineType is collected from <alias> tag. 
	
	//@Qualifier(@Value("${choose.engine}") // Does not work becoz @value can not placed inside another annotation
	private Engine engg; //HAS-A property(composition: StrategyDP Rule#1)
	        //HAS-A property type is interface type StrategyDP Rule#2
	        // All Dependent classes are implementing common interface StrategyDP Rule#2
	
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}
	
	//b.method using the dependent
	public void journey(String startPlace, String destPlace) {
		engg.start();
		System.out.println("Vehicle:: journey started at::"+startPlace);
		System.out.println("journey is going on..........");
		engg.stop();
		System.out.println("vehicle:: journey stopped at::"+destPlace);
	}
}
