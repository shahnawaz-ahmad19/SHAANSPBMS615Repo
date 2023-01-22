package com.shaan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Integer empno;
	private String ename;
	private String job;
	private Float sal;
	
	/*	@Override
		public String toString() {
			return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		public Employee(Integer empno, String ename, String job, Float sal) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.job = job;
			this.sal = sal;
		}
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Integer getEmpno() {
			return empno;
		}
		
		public void setEmpno(Integer empno) {
			this.empno = empno;
		}
		
		public String getEname() {
			return ename;
		}
		
		public void setEname(String ename) {
			this.ename = ename;
		}
		
		public String getJob() {
			return job;
		}
		
		public void setJob(String job) {
			this.job = job;
		}
		
		public Float getSal() {
			return sal;
		}
		
		public void setSal(Float sal) {
			this.sal = sal;
		}
		*/
	
	

	
}
