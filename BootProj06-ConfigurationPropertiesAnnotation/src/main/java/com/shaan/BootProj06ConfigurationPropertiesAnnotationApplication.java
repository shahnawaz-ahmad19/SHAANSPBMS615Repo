package com.shaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.shaan.beans.PersonInfo;


@SpringBootApplication
public class BootProj06ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj06ConfigurationPropertiesAnnotationApplication.class, args);
	     //get spring bean class object
		PersonInfo person=ctx.getBean("pinfo",PersonInfo.class);
		//inoke the methods
		System.out.println("PersonInfo object details:: "+person);

	    //close the container
	    ((ConfigurableApplicationContext) ctx).close();
	    
	}

}
   