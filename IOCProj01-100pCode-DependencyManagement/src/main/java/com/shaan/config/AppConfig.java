package com.shaan.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.shaan.beans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig::0-param constructor");
	}
	
	//@Bean("sysDate")
	@Bean
	public LocalDateTime createLDT() {
		System.out.println("AppConfig.createLDT()");
		return LocalDateTime.now();
	}

}
