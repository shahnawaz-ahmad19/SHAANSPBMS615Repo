package com.shaan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.shaan.beans.Hospital;

@SpringBootApplication
public class BootProj04ValueAnnotationApplication {
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj04ValueAnnotationApplication.class, args);
	    //get spring bean class object
		Hospital hospital=ctx.getBean("hsptl",Hospital.class);
		//invoke the method
		System.out.println("spring bean class obj data::"+hospital);
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
		System.out.println("========================================");
        Environment env=ctx.getEnvironment();
		System.out.println("env object data ::"+env.toString());
		System.out.println("os.name value ="+env.getProperty("os.name"));
		System.out.println("hsptl.name key's value ="+env.getProperty("hsptl.name"));
	}

}
