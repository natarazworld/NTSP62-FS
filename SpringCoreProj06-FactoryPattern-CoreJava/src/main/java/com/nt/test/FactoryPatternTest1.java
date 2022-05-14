//FactoryPatternTest.java (ClientApp)
package com.nt.test;

import com.nt.comps.BajajBike;
import com.nt.comps.Bike;
import com.nt.comps.HeroBike;
import com.nt.factory.BikeFactory;
import com.nt.factory.BikeFactory1;

public class FactoryPatternTest1 {

	public static void main(String[] args) {
		try {
		 //get Bike object
		Bike bike=BikeFactory1.getBike(BajajBike.class);
		bike.drive();
		System.out.println("----------------------------");
		
		 //get Bike object
		Bike bike1=BikeFactory1.getBike(HeroBike.class);
		bike1.drive();
		System.out.println("----------------------------");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
