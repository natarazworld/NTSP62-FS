//IEmployeeDAO.java
package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public  Employee  getEmployeeByNo(int no);
	public  List<Employee> getEmployessByDesgs(String desg1,String desg2);
	
}
