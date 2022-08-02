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
	
	
	private static final String   DELETE_EMP_BY_NO="DELETE FROM EMP WHERE EMPNO=?";
	@Override
	public int remove(int eno) {
		int count=jt.update(DELETE_EMP_BY_NO,eno);
		return count;
	}
	
	private static final String   GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	@Override
	public Employee getEmployeeByNo(int no) {
		 Employee emp=jt.queryForObject(GET_EMP_BY_NO,
				                                                                  (rs,rownum)->{
				                                                                	  // copying ResultSet obj record to Employee object
				                                                                	  Employee e=new Employee();
				                                                                	  e.setEmpno(rs.getInt(1));
				                                                                	  e.setEname(rs.getString(2));
				                                                                	  e.setJob(rs.getString(3));
				                                                                	  e.setSal(rs.getFloat(4));
				                                                                	  return e;
				                                                                  },
				                                                                  no);
		
		return emp;
	}//method
	
	private static final String  UPDATE_EMP_BY_NO="UPDATE EMP SET ENAME=?,JOB=?,SAL=? WHERE EMPNO=?";
	@Override
	public int update(Employee emp) {
		int count=jt.update(UPDATE_EMP_BY_NO, emp.getEname(),emp.getJob(),emp.getSal(),emp.getEmpno());
		return count;
	}

}//class
