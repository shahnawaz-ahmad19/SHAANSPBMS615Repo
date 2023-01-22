package com.shaan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import com.shaan.beans.VotingEligibilityCheck;

public class BeanLifeCycleTest1 {

	public static void main(String[] args) {
		//create BeanFactory IOC  container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/shaan/cfgs/applicationContext.xml");
        
		// get Spring bean class obj
		VotingEligibilityCheck voting=factory.getBean("voting", VotingEligibilityCheck.class);
		//invoke b.method
		System.out.println(voting.checkVotingCriteria());
		
		//destroy singleton
		factory.destroySingletons();
		
	}

}
