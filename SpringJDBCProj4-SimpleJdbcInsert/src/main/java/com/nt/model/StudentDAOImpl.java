//StudentDAOImpl.java 
package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.dao.IStudentDAO;

@Repository("studDAO")
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	private  SimpleJdbcInsert sji;

	/*@Override
	public int insert(Student stud) {
	     //prepare map object having col names and col values
		 Map<String,Object> paramsMap=new HashMap();
		 paramsMap.put("sno", stud.getSno());
		 paramsMap.put("sname", stud.getSname());
		 paramsMap.put("sadd",stud.getSadd());
		 paramsMap.put("avg",stud.getAvg());
		 //specify the db table name
		 sji.setTableName("STUDENT");
		 //Generate and  execute  the INSERT SQL Query
		 int count=sji.execute(paramsMap);
		return count;
	}//method
	*/
	
	/*@Override
	public int insert(Student stud) {
	    //specify the col names and vlaues using the SqlParameterSourceImpl class obj
		MapSqlParameterSource  msps=new MapSqlParameterSource();
		msps.addValue("sno", stud.getSno());
		msps.addValue("sname",stud.getSname());
		msps.addValue("sadd", stud.getSadd());
		msps.addValue("avg", stud.getAvg());
		//set db table name  
		sji.setTableName("STUDENT");
		//generate and execute INSERT SQL Query
		int count=sji.execute(msps);
		return count;
	}*/
	
	@Override
	public int insert(Student stud) {
	    //specify Java Bean class obj as the col names and vlaues using the BeanPropertySqlParameterSource class obj
		// Here java bean property names and  db table col names must match
		BeanPropertySqlParameterSource  bpsps=new BeanPropertySqlParameterSource(stud);
		//set db table name  
		sji.setTableName("STUDENT");
		//generate and execute INSERT SQL Query
		int count=sji.execute(bpsps);
		return count;
	}
	
	
}//class
