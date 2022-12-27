package com.shaan.service;

import com.shaan.bo.EmployeeBO;
import com.shaan.dao.IEmployeeDAO;
import com.shaan.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	//HAS-A property
	private IEmployeeDAO dao;

	//alt+shift+s, o :: to get paramaterized constructor
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeMgmtServiceImpl::1-param constructor");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.registerEmployee()");
		//write b.logic to calculate grossSalary and netSalary
		float grossSalary=dto.getBasicSalary()+dto.getBasicSalary()*0.4f;  // +40% on basicSalary
		float netSalary=grossSalary - dto.getBasicSalary()*0.2f;// -20% on grossSalary
		//prepare BO class obj having persistable data
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		//use DAO
		int count=dao.insertEmployee(bo);
		//generate final result
		return count==1?"Employee registered with netSalary::"+netSalary:"Employee not registered with netSalary::"+netSalary; //ternary operator

	}//method


}//class 
