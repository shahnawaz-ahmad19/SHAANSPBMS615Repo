package com.shaan.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shaan.beans.Cricketer;

public class LookupMethodInjectionTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/shaan/cfgs/applicationContext.xml");
		// get target class object
		Cricketer player=ctx.getBean("cktr", Cricketer.class);
		System.out.println(player.getClass()+" "+player.getClass().getSuperclass()+" "+Arrays.toString(player.getClass().getDeclaredMethods()));
		//invoke bussiness method
		player.batting();
		player.batting();
		player.bowling();
		player.fielding();
		
	}//main
 
}//class
