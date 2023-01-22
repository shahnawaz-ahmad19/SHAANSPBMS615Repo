package com.shaan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("hsptl")
@Data
@PropertySource("input.properties")
public class Hospital {
	
	@Value("KIMS") //hard coding 
	private String name;
	
	@Value("30") //hard coding
	private int rank;
	
	@Value("${hsptl.name}") //COLLECTING FROM PROPERTIES FILES
	private String name1;
	
	@Value("${hsptl.age}") // COLLECTING FROM PROPERTIES FILES
	private int age;
	
	@Value("${Path}") // injecting from environment variable
	private String pathData;
	
	@Value("${os.name}") //injecting system properties value
	private String os;
	
	//@Autowired //Autowiring
	@Value("#{linfo}") // using SPEL Performing injection to object type property
	private LabTestsInfo info; // HAS-A property
	
	@Value("#{linfo.bloodProfilePrice+linfo.rtpcrPrice}") //SPEL based arithmetic opertaion and injection
	private float labTestsBillAmt;
	
	

}
