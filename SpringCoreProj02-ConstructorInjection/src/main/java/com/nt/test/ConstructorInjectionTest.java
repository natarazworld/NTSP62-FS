//SetterInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.sbeans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		System.out.println("ConstructorInjectionTest.main() --start");
		// Hold the name and location of spring bean cfg file
		//FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//FileSystemResource res=new FileSystemResource("G:\\Worskpaces\\Spring\\NTSP62-FS\\SpringCoreProj02-ConstructorInjection\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
		
		
		  // Hold the name and location of spring bean cfg file
		  ClassPathResource res=new ClassPathResource("applicationContext.xml"); //
		  //create spring Container (BeanFactory container)
		   XmlBeanFactory factory=new  XmlBeanFactory(res);
		 
		
		 
		
		System.out.println("_________");
		// get Target spring bean class obj
		Object obj=factory.getBean("wmg");
		System.out.println("_________________");
		//type casting /download casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		String result=generator.showWishMessage("raja");
		System.out.println("Result ::"+result);
		System.out.println("____________________");
		System.out.println("ConstructorInjectionTest.main() --end");
		
	}

}
