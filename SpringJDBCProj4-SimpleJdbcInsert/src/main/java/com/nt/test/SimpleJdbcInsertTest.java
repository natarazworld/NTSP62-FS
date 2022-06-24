//ClientApp
package com.nt.test;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.IStudentDAO;
import com.nt.model.Student;


public class SimpleJdbcInsertTest {

	public static void main(String[] args) {

		//create IOC container
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        //get StudentDAOImpl class obj ref
        IStudentDAO dao=ctx.getBean("studDAO",IStudentDAO.class);
        //invoke the b.method
        try {
        	Student stud=new Student(2121,"anil","hyd12",72.88);	
        	int count=dao.insert(stud);
        	System.out.println(count==0?"Student registration failed":"Student Regigstration succedded");
        }//try
        catch(Exception e) {
        	e.printStackTrace();
        }
         
         //close container
         ctx.close();
	}//main
}//class
