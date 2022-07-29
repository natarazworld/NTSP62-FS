//EmployeeServiceMgmtImpl.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeServiceMgmtImpl implements IEmployeeServiceMgmt {
	@Autowired
	private  IEmployeeDAO  empDAO;

	@Override
	public List<Employee> fetchAllEmps() {
		//use DAO
		List<Employee> list=empDAO.getAllEmployees();
		return list;
	}
	
	@Override
	public String regisgterEmployee(Employee emp) {
		//use DAO
		int count=empDAO.insert(emp);
		return count==0?"Employee not registered":"Employee registered";
	}

}
