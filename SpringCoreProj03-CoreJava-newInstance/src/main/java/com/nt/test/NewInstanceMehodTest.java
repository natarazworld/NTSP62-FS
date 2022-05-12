//NewInstanceMehodTest.java
package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMehodTest {

	public static void main(String[] args) {
		try {
		// Load the given java class dynamically at runtime
		 Class c=Class.forName(args[0]);
		 //get all  the consturctors of given java class dynamically
		 Constructor cons[]=c.getDeclaredConstructors();
		 //create objects for the loaded class
		 Object obj1=cons[0].newInstance(); //creates the obj using 0-param constructor
		 System.out.println(obj1);
		 System.out.println("_________________________");
		 Object obj2=cons[1].newInstance(10,20);//creates the obj using 2-param constructor
		 System.out.println(obj2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
