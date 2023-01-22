package com.shaan.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.shaan.service.BankService;

public class MethodReplacerTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/shaan/cfgs/applicationContext.xml");
		// get target class object/proxy class obj
		BankService service=ctx.getBean("bankService",BankService.class);
		System.out.println(service.getClass()+" "+service.getClass().getSuperclass()+" "+Arrays.toString(service.getClass().getDeclaredMethods()));
		//invoke bussiness method
		System.out.println("Intrest amount::"+service.calcIntrestAmount(100000,2,12));
		//close container
		ctx.close();
		
	}//main
 
}//class
