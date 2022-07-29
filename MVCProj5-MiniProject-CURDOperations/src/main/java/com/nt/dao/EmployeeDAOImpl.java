//EmployeeDAOImpl.java
package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String  GET_ALL_EMPS="SELECT EMPNO,ENAME,JOB,SAL  FROM EMP";

	@Autowired
	private  JdbcTemplate jt;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=jt.query(GET_ALL_EMPS, rs->{
			
			List<Employee> al=new ArrayList();
			while(rs.next()) {
				Employee e=new Employee();
				e.setEmpno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setSal(rs.getFloat(4));
				al.add(e);
			}//whilke
			return al;
		});
	
		return list;
	} //method
	
	private static final String  INSERT_EMP_QUERY="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(EMP_NO_SEQ.NEXTVAL,?,?,?)";
	@Override
	public int insert(Employee emp) {
		int count=jt.update(INSERT_EMP_QUERY, emp.getEname(),emp.getJob(),emp.getSal());
		return count;
	}

}//class
