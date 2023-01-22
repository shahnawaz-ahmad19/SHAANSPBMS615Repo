package com.shaan.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shaan.beans.VotingEligibilityCheck;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/shaan/cfgs/applicationContext.xml");
        // get Spring bean class obj
		VotingEligibilityCheck voting=ctx.getBean("voting", VotingEligibilityCheck.class);
		//invoke b.method
		System.out.println(voting.checkVotingCriteria());
		
		//close IOC container
		ctx.close();
	}

}
