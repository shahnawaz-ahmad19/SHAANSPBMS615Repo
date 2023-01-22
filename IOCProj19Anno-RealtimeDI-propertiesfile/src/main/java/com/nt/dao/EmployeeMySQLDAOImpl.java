package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;   //ctl+shift+o  :: To import pkgs

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("mysqlEmpDAO")
public class EmployeeMySQLDAOImpl implements IEmployeeDAO {
	private static final String  EMP_INSERT_QUERY="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?)";
	//HAS-A Property
	@Autowired
	private  DataSource ds;
	
	
	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeMysqlDAOImpl.insertEmployee()");
		int result=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(EMP_INSERT_QUERY);
				){
			//set values to query params
			ps.setString(1,bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the Query
			 result=ps.executeUpdate();
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e; //exception rethrowing
		}
		
		return result;
	}//method
	

	/*@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			//get Pooled JDBC con object
			con=ds.getConnection();
			//create PreparedStatment object having  query as the pre-compiled SQL query
			ps=con.prepareStatement(EMP_INSERT_QUERY);
			//set values to query params
			ps.setString(1,bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the Query
			 result=ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //exeption rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//close jdbc objs
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
		}//finally
		return result;
	}//method */

}//class
