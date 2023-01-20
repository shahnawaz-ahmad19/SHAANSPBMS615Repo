package com.shaan.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shaan.beans.WishMessageGenerator;
import com.shaan.config.AppConfig;


public class DependencyManagementTest {
	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get target class object
		//WishMessageGenerator generator=ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator=ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		//invoke b.method
		String result=generator.generateWishMessage("Shaan");
		System.out.println("Output::"+ result);
		System.out.println("=========================");
		LocalDateTime ldt=ctx.getBean("createLDT",LocalDateTime.class);
		System.out.println(ldt);
		
		//close the IOC  container
		ctx.close();
		
	}//main

}//class
