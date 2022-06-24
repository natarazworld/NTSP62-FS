//IEmployeeDAO.java
package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
    public  int  getEmployeesCountBySalaryRange(double start,double end);
    public  List<Employee>  getEmployeesByNameChars(String nameChars);
    public   int   registerEmployee(Employee emp);
}
