//BikeFactory1.java (Factory Pattern with generics)
package com.nt.factory;

import java.lang.reflect.Constructor;

import com.nt.comps.Bike;

public class BikeFactory1 {
	   //static factory with  generics 
	  public  static  <T extends Bike>   T  getBike(Class<T> clazz) throws Exception{
		     try {
		    	 //get All constructors of the class
		    	 Constructor cons[]=clazz.getDeclaredConstructors();
		    	 //create object 
		    	 return (T) cons[0].newInstance();
		     }
		     catch(Exception e) {
		    	 e.printStackTrace();
		    	 throw e;
		     }
		  
	  }//method

}//class
