// FlipkartFactory.java (Factory Pattern to simplify the process of object creation)
package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	
	 //static  factory method
	public  static Flipkart getInstance(String courierType) {
		  //create Dependent class obj
		   Courier courier=null;
		    if(courierType.equalsIgnoreCase("dtdc"))
		    	  courier=new DTDC();
		    else if(courierType.equalsIgnoreCase("bDart"))
		    	  courier=new BlueDart();
		    else if(courierType.equalsIgnoreCase("dhl"))
		    	  courier=new DHL();
		    else 
		    	   throw new  IllegalArgumentException("Invalid courier type");
		    //create target class object
		     Flipkart fpkt=new Flipkart();
		       //assign Dependent class obj to target class obj
		     fpkt.SetCourier(courier);
		     //return  Target class obj having  Dependent class obj
		       return  fpkt;
	}//method
}//class
