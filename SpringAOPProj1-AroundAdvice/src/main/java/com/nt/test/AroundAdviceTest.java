//AroundAdviceTest.java (Client App)
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AroundAdviceTest {

	public static void main(String[] args) {
        //create IOC container
		ClassPathXmlApplicationContext ctx=
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Proxy class object
		BankService service=ctx.getBean("bankService",BankService.class);
		System.out.println(service.getClass()+" ------- "+service.getClass().getSuperclass());
		//invoke the b.methods
		try {
			System.out.println("Simple Intrest amount::"+service.calcSimpleIntrestAmount(50000.0, 2.0,12.0));
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("________________________________________");
		try {
			System.out.println("Compound Intrest amount::"+service.calcCompoundIntrestAmount(50000.0, 2.0,12.0));
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// close IOC container
		ctx.close();

	}//main

}//class
