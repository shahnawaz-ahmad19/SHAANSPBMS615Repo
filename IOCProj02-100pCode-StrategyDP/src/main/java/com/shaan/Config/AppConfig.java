package com.shaan.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.shaan.beans")
@ImportResource("com/shaan/cfgs/applicationContext.xml")
public class AppConfig {
     public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
}
