package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.IEmployeeDAO;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get DAO class obj ref
		IEmployeeDAO  dao=ctx.getBean("empDAO",IEmployeeDAO.class);
		//invoke the b.method
		int count=dao.getEmployessCount();
		System.out.println("Employess count is ::"+count);
	}//main
}//class
