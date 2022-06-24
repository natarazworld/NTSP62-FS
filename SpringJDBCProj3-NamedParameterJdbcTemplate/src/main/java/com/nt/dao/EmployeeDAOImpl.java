//EmployeeDAOImpl.java
package com.nt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_COUNT_BY_SAL_RANGE="SELECT COUNT(*) FROM EMP WHERE  SAL>=:min AND SAL<=:max";
	private static final String GET_EMPS_BY_NAMECHARS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP  WHERE ENAME LIKE :initChars";
	private static final String INSERT_EMPLOYEE="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES(:eno,:ename,:desg,:sal,:dno)";
	@Autowired
	private NamedParameterJdbcTemplate npjt;

	@Override
	public int getEmployeesCountBySalaryRange(double start, double end) {
		Map<String,Object> paramsMap=new HashMap();
		paramsMap.put("min", start); paramsMap.put("max",end);
	     int count=npjt.queryForObject(GET_EMPS_COUNT_BY_SAL_RANGE, 
	    		                                                       paramsMap,
	    		                                                        Integer.class);
		return count;
	}

	@Override
	public List<Employee> getEmployeesByNameChars(String nameChars) {
		//prepare named param values
		MapSqlParameterSource msps=new MapSqlParameterSource();
		msps.addValue("initChars",nameChars+"%");
		
		//public <T> T query(String sql,   SqlParameterSource paramSource, ResultSetExtractor<T> rse) throws DataAccessException
		List<Employee> list=npjt.query(GET_EMPS_BY_NAMECHARS,
				                                                      msps,
				                                                      rs->{
				                                                    	  //copy  RS object records  to List<Employee> obj
				                                                    	  List<Employee> list1=new ArrayList();
				                                                    	  while(rs.next()) {
				                                                    		  Employee e=new Employee();
				                                                    		  e.setEno(rs.getInt(1));
				                                                    		  e.setEname(rs.getString(2));
				                                                    		  e.setDesg(rs.getString(3));
				                                                    		  e.setSal(rs.getDouble(4));
				                                                    		  e.setDno(rs.getInt(5));
				                                                    		  list1.add(e);
				                                                    	  }//while
				                                                    	  return list1;
				                                                      });
		
		return list;
	}
	
	@Override
	public int registerEmployee(Employee emp) {
	    //prepare  named param values
		BeanPropertySqlParameterSource bpsps=new BeanPropertySqlParameterSource(emp);
		int count=npjt.update(INSERT_EMPLOYEE, bpsps);
		return count;
	}

}
