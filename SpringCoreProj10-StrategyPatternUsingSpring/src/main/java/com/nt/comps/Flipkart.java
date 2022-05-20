//Flipkart.java  ( target class)
package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	 //HAS- A property
	private   Courier courier;  // rule -1(HAS-A property)  
	                                                   // rule2 (code to interfaces)
	                                                   //rule3  ( taking the class final class)
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	
	///setter method  for Injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.SetCourier(-)");
		this.courier=courier;
	}
	
	//b,method
	public  String  shopping(String items[],float prices[]) {
		 //calculate bill amount
		  float billAmt=0.0f;
		  for(float p:prices)
			  billAmt=billAmt+p;
		  //generate  random number as the order id
		   int oid=new Random().nextInt(10000);
		   // deliver the products using courier service
		    String deliverMsg=courier.deliver(oid);
		    // return  final  message
		    return Arrays.toString(items)+"  with prices"+ Arrays.toString(prices) +" having billAmount::"+billAmt +"   "+deliverMsg;
	} //method

}//class
