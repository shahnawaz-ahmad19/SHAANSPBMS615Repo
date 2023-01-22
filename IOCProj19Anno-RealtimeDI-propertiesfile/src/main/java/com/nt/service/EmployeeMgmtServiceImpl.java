package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	//HAS -A property
	@Autowired
	@Qualifier("dbOption")
	private IEmployeeDAO dao;
	


	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {   
		//write  b.logic to calculate grossSalary and NetSalary
		float grossSalary=dto.getBasicSalary()+ dto.getBasicSalary()*0.4f;   // +40% on BasicSalary
		float netSalary=grossSalary -  dto.getBasicSalary()*0.2f;  // - 20% on grossSalary
		//prepare BO class obj having  persistable data
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		//use DAO
		int count=dao.insertEmployee(bo);
		// generate final result
		return count==1?"Employee registered with netSalary::"+netSalary:"Employee not registered with netSalary::"+netSalary;  //ternary opeartor
	}//method

	
}//class
