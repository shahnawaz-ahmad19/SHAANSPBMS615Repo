package com.shaan.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shaan.beans.Cricketer;

public class DependencyLookupTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/shaan/cfgs/applicationContext.xml");
		// get target class object
		Cricketer player=ctx.getBean("cktr", Cricketer.class);
		//invoke bussiness method
		player.batting();
		player.bowling();
		player.fielding();
		
	}//main
 
}//class
