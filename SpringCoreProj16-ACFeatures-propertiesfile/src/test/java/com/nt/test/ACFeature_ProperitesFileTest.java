package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.EmployeeInfo;

public class ACFeature_ProperitesFileTest {

	public static void main(String[] args) {
	    // create IOC container 
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		/*DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");*/
		//get  Employee class obj ref
		EmployeeInfo emp=ctx.getBean("emp",EmployeeInfo.class);
		//  display the data
		System.out.println(emp.toString());
		/*System.out.println("_______________");
		Environment env=ctx.getEnvironment();
		System.out.println(env.getRequiredProperty("os.name"));*/
	
	}

}
