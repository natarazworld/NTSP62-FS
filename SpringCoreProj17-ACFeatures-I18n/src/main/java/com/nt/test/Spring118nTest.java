//Spring118nTest.java (Client App) 
package com.nt.test;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring118nTest {

	public static void main(String[] args) {
		
		//create  IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//prepare java.util.Locale obj by suppling language and country
		Locale locale=new Locale(args[0],args[1]);
		// get MEssages from the given Locale specific properties file
		String msg1=ctx.getMessage("welcome.msg", new Object[] {} ,locale);
		String msg2=ctx.getMessage("goodbye.msg",new Object[] {}, locale);
		System.out.println(msg1+"   "+msg2);

	}//main
}//class
