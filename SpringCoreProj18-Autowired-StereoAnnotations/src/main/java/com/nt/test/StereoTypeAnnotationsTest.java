//StereoTypeAnnotationsTest .java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class StereoTypeAnnotationsTest {

	public static void main(String[] args) {
		
		// ApplicationContext container creation
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Target spring bean class obj ref
		 WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result=generator.showWishMessage("raja");
		System.out.println("Result ::"+result);
		
		//close the IOC container
		ctx.close();
		
	}

}
