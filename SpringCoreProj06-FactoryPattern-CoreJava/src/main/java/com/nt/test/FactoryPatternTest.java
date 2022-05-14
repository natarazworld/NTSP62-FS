//FactoryPatternTest.java (ClientApp)
package com.nt.test;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		 //get Bike object
		Bike bike=BikeFactory.getBike("honda");
		bike.drive();
		System.out.println("----------------------------");
		
		 //get Bike object
		Bike bike1=BikeFactory.getBike("bajaj");
		bike1.drive();
		System.out.println("----------------------------");


	}

}
