//JavaConfigApproachTest.java
package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class JavaConfigApproachTest {

	public static void main(String[] args) {
		
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		// get Target spring bean class obj
		 WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result=generator.showWishMessage("raja");
		System.out.println("Result ::"+result);
		System.out.println("___________________________");
		LocalDateTime ldt=ctx.getBean("createLDT",LocalDateTime.class);
		System.out.println(ldt);
		
		//close the IOC container
		ctx.close();
		
	}

}
