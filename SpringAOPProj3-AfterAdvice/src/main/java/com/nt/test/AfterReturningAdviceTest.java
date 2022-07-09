//AfterReturningAdviceTest.java
package com.nt.test;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		 //create IOC contianer  
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class obj ref
		ShoppingStore store=ctx.getBean("store",ShoppingStore.class);
		//invoke the b,method
		try {
			double billamount=store.shopping(new String[] {"shirt","trouser","shoe"},
					                                                              new double[] {90000.0,6000.0,4000.0});
			System.out.println("Bill amount::"+billamount);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}

		//close the container
		 ctx.close();
		
	}//main
}//class
