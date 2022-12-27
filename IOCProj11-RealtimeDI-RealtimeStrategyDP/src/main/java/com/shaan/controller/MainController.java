package com.shaan.controller;

import com.shaan.dto.EmployeeDTO;
import com.shaan.service.IEmployeeMgmtService;
import com.shaan.vo.EmployeeVO;

public class MainController {
     //HAS-A property
	private  IEmployeeMgmtService service;

	//alt+shift+s, o  //-->for paramaterized constructor
	public MainController(IEmployeeMgmtService service) {
		System.out.println("MainController::1-param constructor");
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo)throws Exception{
		//convert EmployeeVO class object to EmployeeDTO class obj
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		//use service
		String result=service.registerEmployee(dto);
		
		return result;
	} 
	
}
