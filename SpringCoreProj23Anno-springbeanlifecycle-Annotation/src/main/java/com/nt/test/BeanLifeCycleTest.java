//BeanLifeCycleTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.CitizenVotingElgibilityChecking;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class obj ref
		 CitizenVotingElgibilityChecking citizen=ctx.getBean("citizen",CitizenVotingElgibilityChecking.class);
		 //invoke the b.method
		   System.out.println(citizen.checkVotingElgibility());
		   //close container
		   ctx.close();
	}//main
}//class
