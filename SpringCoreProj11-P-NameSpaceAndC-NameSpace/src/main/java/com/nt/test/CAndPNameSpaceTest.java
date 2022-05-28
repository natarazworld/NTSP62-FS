//CAndPNameSpaceTest.java
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.sbeans.Employee;

public class CAndPNameSpaceTest {

	public static void main(String[] args) {
		 //create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get Target Spring bean class obj ref
		Employee emp=factory.getBean("emp",Employee.class);
		System.out.println(emp);
		System.out.println("_______________");
		Employee emp1=factory.getBean("emp",Employee.class);
		System.out.println(emp1);
		System.out.println(emp.hashCode()+"  "+emp1.hashCode());


	}//main
}//class
