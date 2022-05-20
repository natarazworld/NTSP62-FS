//StrategyDPTest.java  (Client App)
package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
	       // use Factory  to get  Target class obj
		Flipkart fpkt=FlipkartFactory.getInstance();
		//invoke the b.method
		 String  resultMsg=fpkt.shopping(new String[] {"shirt","trouser","watch","shoe"},
			                                                               new float[] {	2000.0f,4000.0f,5000.0f,10000.0f });
		   System.out.println(resultMsg);
		 }//main

}//class
