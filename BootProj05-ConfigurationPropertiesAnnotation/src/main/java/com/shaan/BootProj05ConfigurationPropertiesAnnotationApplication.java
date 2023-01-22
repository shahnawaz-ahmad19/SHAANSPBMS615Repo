package com.shaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.shaan.beans.CustomerInfo;
import com.shaan.beans.Employee;

@SpringBootApplication
public class BootProj05ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj05ConfigurationPropertiesAnnotationApplication.class, args);
	    //get spring bean class object
	    CustomerInfo info=ctx.getBean("custInfo", CustomerInfo.class);
	    //invoke the b.method
	    System.out.println("Customerinfo object data::"+info);
	    
	    System.out.println("=======================================");
	    
	  //get spring bean class object
	    Employee emp=ctx.getBean("emp", Employee.class);
	    //invoke the b.method
	    System.out.println("Employee  object data::"+emp);
	   
	    //close the container
	    ((ConfigurableApplicationContext) ctx).close();
	    
	}

}
   