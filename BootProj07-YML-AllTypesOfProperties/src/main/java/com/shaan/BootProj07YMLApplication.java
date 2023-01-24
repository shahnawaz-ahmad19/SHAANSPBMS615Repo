package com.shaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.shaan.beans.PersonInfo;


@SpringBootApplication
public class BootProj07YMLApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj07YMLApplication.class, args);
	     //get spring bean class object
		PersonInfo info=ctx.getBean("pinfo",PersonInfo.class);
		//inoke the b.methods
		System.out.println("PersonInfo object details:: "+info);

	    //close the container
	    ((ConfigurableApplicationContext) ctx).close();
	    
	}

}
   