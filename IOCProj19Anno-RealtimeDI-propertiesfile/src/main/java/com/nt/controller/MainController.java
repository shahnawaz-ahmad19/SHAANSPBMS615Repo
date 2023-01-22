package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;
import com.nt.vo.EmployeeVO;

@Controller("controller")
public class MainController {
	//HAS -A property
	@Autowired
	private IEmployeeMgmtService service;

	
	public String   processEmployee(EmployeeVO vo)throws Exception{
		//convert EmployeeVO class object to EmployeDTO class obj
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		//use service
		String result=service.registerEmployee(dto);
		
		return result;
	}
	
	
	
	

}
