package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {
    public  int getEmployessCount();
    public  Map<String,Object>  getEmployeeByNo(int no);
    public List<Map<String,Object>> getEmployeesByDesgs(String desg1,String desg2);
    public  int  registerEmployee(int eno,String ename, String desg, double salary);
    public int  addBonusToEmployeesBySalaryRange(double bonusAmt, double startSalary,double endSalary);
    public  int  fireEmployeesByDesg(String desg);
}

