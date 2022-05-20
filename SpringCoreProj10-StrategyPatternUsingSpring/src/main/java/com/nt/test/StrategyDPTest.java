//StrategyDPTest.java (Client App)
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comps.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Target clss obj ref
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		// invoke the b.method
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser","watch"},
				                                                       new float[] {3000,6000,10000});
		System.out.println(resultMsg);

	}//main

}//class
