 package com.shaan.test;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.shaan.beans.WishMessageGenerator;

public class AutowiredTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/shaan/cfgs2/applicationContext.xml");
		//get spring bean class object
		WishMessageGenerator generator=ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		
		
		//invoke the bussiness method
		String result=generator.generateMessage("Shaan");
		System.out  .println("Wish Message is::"+result);

		//close the IOC container class
		ctx.close();
	}//main 

}//class
