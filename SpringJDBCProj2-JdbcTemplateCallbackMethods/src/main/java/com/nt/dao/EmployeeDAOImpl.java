//EmployeeDAOImpl.java
package com.nt.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private  static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	@Autowired
	private JdbcTemplate jt;  //HAS- A property
	
	
	
	@Override
	public Employee getEmployeeByNo(int no) {
		Employee emp=jt.queryForObject(GET_EMP_BY_NO,
				                                                           new BeanPropertyRowMapper<Employee>(Employee.class) ,
				                                                             no);
		return emp;
	}
	
	
	
	/*@Override
	public Employee getEmployeeByNo(int no) {
		Employee e=jt.queryForObject(GET_EMP_BY_NO,
				                                                             (rs,rowNum)->{
				                                                            		//copy RS object record to  Employee class obj
																				 Employee emp=new Employee();
																				 emp.setEno(rs.getInt(1));
																				 emp.setEname(rs.getString(2));
																				 emp.setDesg(rs.getString(3));
																				 emp.setSalary(rs.getDouble(4));
																				 emp.setDeptno(rs.getInt(5));
																				return emp;	 
				                                                             }
				                                                             ,
				                                                             no);
		
		return e;
	
	}*/
	
	
	
	/*@Override
	public Employee getEmployeeByNo(int no) {
		Employee emp=jt.queryForObject(GET_EMP_BY_NO,
				                                                            new RowMapper<Employee>() {
	
																				@Override
																				public Employee mapRow(ResultSet rs,int rowNum)throws SQLException {
																					//copy RS object record to  Employee class obj
																					 Employee emp=new Employee();
																					 emp.setEno(rs.getInt(1));
																					 emp.setEname(rs.getString(2));
																					 emp.setDesg(rs.getString(3));
																					 emp.setSalary(rs.getDouble(4));
																					 emp.setDeptno(rs.getInt(5));
																					return emp;
																				}//mapRow(-,-)
		                                                                      },// end of anonymous inner class
				                                                            no);
		return emp;
	
	}//method
	*/	
	
	
	

	/*@Override
	public Employee getEmployeeByNo(int no) {
		System.out.println("EmployeeDAOImpl.getEmployeeByNo()");
		Employee emp=jt.queryForObject(GET_EMP_BY_NO,
				                                                            new EmployeeMapper(), 
				                                                            no);
		return emp;
		
	}
	
	//nested inner class --static inner class
	 private  static  class EmployeeMapper  implements RowMapper<Employee>{
	
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDAOImpl.EmployeeMapper.mapRow(-,-)");
			System.out.println("Record number ::"+rowNum);
			//copy RS object record to  Employee class obj
			 Employee emp=new Employee();
			 emp.setEno(rs.getInt(1));
			 emp.setEname(rs.getString(2));
			 emp.setDesg(rs.getString(3));
			 emp.setSalary(rs.getDouble(4));
			 emp.setDeptno(rs.getInt(5));
			return emp;
		}//method
		 
	 }//inner class
	*/
}///outer class
