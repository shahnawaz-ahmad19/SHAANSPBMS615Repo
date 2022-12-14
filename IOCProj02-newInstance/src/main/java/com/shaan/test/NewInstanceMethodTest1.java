//NewInstanceMethodTest.java

package com.shaan.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest1 {
	public static void main(String[] args) throws Exception{
		//Load classes
		Class c1=Class.forName(args[0]);
		//get all the constructor of the loaded class
		Constructor cons[]=c1.getDeclaredConstructors();
		//Dynamic object creation using 0-param constructor
		Object obj1=cons[0].newInstance();
		System.out.println(obj1);
		System.out.println("----------------------------");
		//Dynamic object creation using 2-param constructor
		Object obj2=cons[1].newInstance(100,"India");
		System.out.println(obj2);
		
		
	}

}
