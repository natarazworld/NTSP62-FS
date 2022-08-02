//IEmployeeDAO.java
//IEmployeeDAO .java (DAO Interface)
package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
    public  List<Employee>  getAllEmployees();
    public   int   insert(Employee emp);
    public   int  remove(int eno);
        public  Employee  getEmployeeByNo(int no);
        public  int  update(Employee emp);
}
