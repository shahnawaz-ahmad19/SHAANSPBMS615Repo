package com.shaan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.shaan.beans.Customer;
import com.shaan.beans.Employee1;
import com.shaan.beans.Student;

public class constructorVsSetterInjectionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/shaan/cfgs/applicationContext.xml");
		//get Spring bean class object
		Employee1 emp1=factory.getBean("emp1", Employee1.class);
		System.out.println(emp1);
		System.out.println("=======================");
		Student st1=factory.getBean("stud1", Student.class);
		System.out.println(st1);
		System.out.println("===================");
		Customer cust1=factory.getBean("cust1", Customer.class);
		System.out.println(cust1);
		
		 
	} 


}
