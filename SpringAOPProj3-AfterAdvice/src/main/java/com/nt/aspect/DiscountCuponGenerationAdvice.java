//DiscountCuponGenerationAdvice.java
package com.nt.aspect;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("cuponAdvice")
@Aspect
public class DiscountCuponGenerationAdvice {
	
	@AfterReturning(returning ="bamt",
			                            value="execution( double com.nt.service.ShoppingStore.shopping(..))")
	public  void   cupon(JoinPoint jp, double bamt)throws Throwable {
		String cuponMsg=null;
		if(bamt<=5000)
			cuponMsg="Avail 5% Discount in the next purchase";
		else if(bamt<=10000)
			cuponMsg="Avail 10% Discount in the next purchase";
		else if(bamt<=20000)
			cuponMsg="Avail 15% Discount in the next purchase";
		else
			cuponMsg="Avail 20% Discount in the next purchase";
		//write the message to cupon
		FileWriter writer=new FileWriter("e:\\cupon.txt");
		writer.write(cuponMsg);
		writer.flush();
		writer.close();
		System.out.println("Cupon Generated ....");
	}//method
}//class
