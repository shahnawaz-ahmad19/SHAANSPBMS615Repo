 package com.shaan.test;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.shaan.beans.WishMessageGenerator;

public class AutowiredTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/shaan/cfgs2/applicationContext.xml");
		//get spring bean class object
		WishMessageGenerator generator=ctx.getBean("com.shaan.beans.WishMessageGenerator#0", WishMessageGenerator.class);
		
		WishMessageGenerator generator1=ctx.getBean("com.shaan.beans.WishMessageGenerator#1", WishMessageGenerator.class);
		System.out.println(generator.hashCode()+" "+generator1.hashCode());
		//invoke the bussiness method
		String result=generator1.generateMessage("Shaan");
		System.out  .println("Wish Message is::"+result);
		
		System.out.println("spring beans count"+ctx.getBeanDefinitionCount());
		System.out.println("bean ids ::"+Arrays.toString(ctx.getBeanDefinitionNames()));
		 
		//close the IOc container class
		ctx.close();
	}//main 

}//class
