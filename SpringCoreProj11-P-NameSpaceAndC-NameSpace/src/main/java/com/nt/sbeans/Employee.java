//Employee.java (Target class)
package com.nt.sbeans;

import java.util.Date;

public class Employee {
	private int  eno;
	private String ename;
	private  Date  dob;
	private double salary;
	private   Department dept;
	
	public Employee() {
		System.out.println("Employee:: 0-param constructor");
	}
	
	//setter methods for setter Injection (alt+shift+s,r)
	public void setEno(int eno) {
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}
	public void setEname(String ename) {
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}
	public void setDob(Date dob) {
		System.out.println("Employee.setDob()");
		this.dob = dob;
	}
	public void setSalary(double salary) {
		System.out.println("Employee.setSalary()");
		this.salary = salary;
	}
	public void setDept(Department dept) {
		System.out.println("Employee.setDept()");
		this.dept = dept;
	}
	
	
	
	//toString (alt+shift+s,s)
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}
}//class
