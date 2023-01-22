package com.shaan.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer {
	
	//no HAS-A property of dependent class
       public Cricketer() {
         System.out.println("Cricketer:: 0-param constructor");
	}
       
       public void bowling() {
    	   System.out.println("Cricketer is bowling");
       }
       
       public void batting() {
    	   System.out.println("Cricketer is batting()");
    	   //create additional IOC container
    	   ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/shaan/cfgs/applicationContext.xml");
    	   //perform dependency lookup method to get Dependent class object
    	   Bat bat=ctx.getBean("bat", Bat.class);// Dependency Lookup code
    	   int score=bat.scoreRuns();
    	   System.out.println("Cricketer  batting score is ::"+score);
       }
       
       public void fielding() {
    	   System.out.println("Cricketer is fielding");
       }
       
       public void wicketKeeping() {
    	   System.out.println("Cricketer is Keeping the wickets");
       }
}
