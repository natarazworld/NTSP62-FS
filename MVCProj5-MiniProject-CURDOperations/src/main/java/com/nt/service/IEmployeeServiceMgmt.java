//IEmployeeServiceMgmt.java (service interface)
package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeServiceMgmt {
    public  List<Employee> fetchAllEmps();
    public  String  regisgterEmployee(Employee emp);
    public   String  deleteEmployee(int eno);
    
    public   Employee fetchEmployeeByNo(int no);
    public String  modifyEmployee(Employee emp);
   
}
