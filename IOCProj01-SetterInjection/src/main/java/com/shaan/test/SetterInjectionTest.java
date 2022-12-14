 package com.shaan.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.shaan.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		//Hold spring bean cfg file name and location   (ctrl+shift+O :: to import pkg)
		FileSystemResource res = new FileSystemResource("src/main/java/com/shaan/cfgs/applicationContext.xml");
		// create IOC container(BeanFactory container)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get target spring bean class object
		Object obj=factory.getBean("wmg");
		//typecasting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke the bussiness method
		String result=generator.generateMessage("Shaan");
		System.out.println("Wish Message is::"+result);
		
	}//main

}//class
