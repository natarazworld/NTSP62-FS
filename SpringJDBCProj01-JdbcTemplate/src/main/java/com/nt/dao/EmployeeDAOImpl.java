//EmployeeDAOImpl.java
package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL  FROM EMP WHERE EMPNO=?";
	private static final String GET_EMPS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL  FROM EMP WHERE JOB IN(?,?) ORDER BY JOB";
	private static final String INSERT_EMP_QUERY="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(?,?,?,?)";
	private static final String UPDATE_BONUS_TO_EMPLOYEES_BY_DESGS="UPDATE EMP SET SAL=SAL+? WHERE SAL>=? AND SAL<=?";
	private static final String DELETE_EMPLOYEES_BY_DESG="DELETE FROM EMP WHERE JOB=?";
	
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int getEmployessCount() {
		int count=jt.queryForObject(GET_EMPS_COUNT, Integer.class);
		return count;
	}

	@Override
	public Map<String, Object> getEmployeeByNo(int no) {
		Map<String,Object> map=jt.queryForMap(GET_EMP_BY_NO,no);
		return map;
	}

	@Override
	public List<Map<String, Object>> getEmployeesByDesgs(String desg1, String desg2) {
		List<Map<String,Object>> list=jt.queryForList(GET_EMPS_BY_DESGS, desg1,desg2);
		return list;
		
	}

	@Override
	public int registerEmployee(int eno, String ename, String desg, double salary) {
		int  count=jt.update(INSERT_EMP_QUERY, eno,ename,desg,salary);
		return count;
	}
	
	@Override
	public int addBonusToEmployeesBySalaryRange(double bonusAmt, double startSalary, double endSalary) {
	   int count=jt.update(UPDATE_BONUS_TO_EMPLOYEES_BY_DESGS, bonusAmt,startSalary,endSalary);
		return count;
	}
	
	
	@Override
	public int fireEmployeesByDesg(String desg) {
		int count=jt.update(DELETE_EMPLOYEES_BY_DESG,desg);
		return count;
	}
	 
	
	

}
