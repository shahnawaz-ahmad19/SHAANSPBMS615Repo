package com.shaan.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotingEligibilityCheck implements InitializingBean, DisposableBean {
	//Bean properties
	private String name;
	private int age;
	private String addrs;
	private Date verifiedOn;
	//Setter methods for setter injection
	
	public void setName(String name) {
		System.out.println("VotingEligibilityCheck.setName(-)");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotingEligibilityCheck.setAge(-)");
		this.age = age;
	}
	public void setAddrs(String addrs) {
		System.out.println("VotingEligibilityCheck.setAddrs(-)");
		this.addrs = addrs;
	}
	
	/*//custom init method
	public void myInit() {
		System.out.println("VotingEligibilityCheck.myInit()");
		//initialize left over properties
		verifiedOn=new Date();
		if(addrs==null)
			addrs=" not provided";
		//validation logic
		if(name==null)
			throw new IllegalArgumentException("Name is required!!");
		else if(age<=0 || age>=126)
			throw new IllegalArgumentException("Person age must be in the range of 1 through 125");
		
	}*/
	
	//b.method
	public String checkVotingCriteria() {
		//b.logic
		if(age<18)
			return "Mr./Mrs./Miss "+ name+" ("+age+")"+ " belongs to "+addrs+" is not eligible for voting -->verified on ::"+verifiedOn;
		else
			return "Mr./Mrs./Miss "+ name+"("+age+")"+" belongs to "+addrs+" is  eligible for voting -->verified on ::"+verifiedOn;
	}
	
	
	/*public void myDestroy() {
		System.out.println("VotingEligibilityCheck.myDestroy()");
		//nullify bean property
		name=null;
		age=0;
		verifiedOn=null;
		addrs=null;
		
	}*/
	
	@Override
	public void destroy() throws Exception {
		System.out.println("VotingEligibilityCheck.Destroy()");
		//nullify bean property
		name=null;
		age=0;
		verifiedOn=null;
		addrs=null;	
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingEligibilityCheck.afterPropertiesSet()");
		//initialize left over properties
		verifiedOn=new Date();
		if(addrs==null)
			addrs=" not provided";
		//validation logic
		if(name==null)
			throw new IllegalArgumentException("Name is required!!");
		else if(age<=0 || age>=126)
			throw new IllegalArgumentException("Person age must be in the range of 1 through 125");
		
	}//method
	
	

}//class
