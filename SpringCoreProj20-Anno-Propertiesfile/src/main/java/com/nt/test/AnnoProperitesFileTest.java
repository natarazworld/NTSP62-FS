// AnnoProperitesFileTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.EmployeeInfo;

public class AnnoProperitesFileTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class object ref
		EmployeeInfo  info=ctx.getBean("emp",EmployeeInfo.class);
		System.out.println("emp data::"+info);
	}//main
}//class
