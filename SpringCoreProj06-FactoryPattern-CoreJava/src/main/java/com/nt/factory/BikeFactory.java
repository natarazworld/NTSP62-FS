//BikeFactory.java (Factory Pattern)
package com.nt.factory;

import com.nt.comps.BajajBike;
import com.nt.comps.Bike;
import com.nt.comps.HeroBike;
import com.nt.comps.HondaBike;

public class BikeFactory {
	
	 //static  factory method
	public static  Bike   getBike(String type) {
		  Bike bike=null;
		 if(type.equalsIgnoreCase("bajaj"))
			 bike=new BajajBike();
		 else if(type.equalsIgnoreCase("hero"))
			 bike=new HeroBike();
		 else if(type.equalsIgnoreCase("honda"))
			 bike=new HondaBike();
		 else 
			 throw new IllegalArgumentException("Invalid bike Type");
		 
		 return bike;
	}

}
