package com.shaan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.shaan.beans.A;

public class CyclicDITest {
	public static void main(String[] args) {
		//Create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/shaan/cfgs/applicationContext.xml");
		
		//get Spring bean class obj
		A oa=factory.getBean("a1", A.class);
		System.out.println(oa);
	}

}
   