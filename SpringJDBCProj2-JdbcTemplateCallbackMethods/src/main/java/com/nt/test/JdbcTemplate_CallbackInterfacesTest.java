// JdbcTemplate_CallbackInterfacesTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

public class JdbcTemplate_CallbackInterfacesTest {

	public static void main(String[] args) {
	  //create IOC container
		 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get DAOImpl class obj ref
		 IEmployeeDAO dao=ctx.getBean("empDAO",IEmployeeDAO.class);
		 try {
		 //invoke the b.method
		 Employee emp=dao.getEmployeeByNo(7499);
		 System.out.println(emp);
		 }//try
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 //close container
		 ctx.close();

	}//main
}//class
