//BeforeAdviceTest.java (Client App)
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ResidentOperationsService;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy class obj ref
		ResidentOperationsService proxy=ctx.getBean("roService",ResidentOperationsService.class);
		//invoke the b.method
		try {
			String msg=proxy.arrangeLunchForGuest("HK Sir", 999999L,4);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}//method
}//class
