package com.shaan.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("pinfo")
@ConfigurationProperties(prefix="per.info")
public class PersonInfo {
	//simple/wrapper type
	private Integer pid;
	private String pname;
	//array type
	private String[] favColors;
	//List-collection type
	private List<String> studies;
	//Set-Collection type
	private Set<Long> phoneNumbers;
	//Map-Collection type
	private Map<String,Object> idDetails;
	
	//HAS-A type(composition properties)
	private JobDetails jobinfo;
	

}
