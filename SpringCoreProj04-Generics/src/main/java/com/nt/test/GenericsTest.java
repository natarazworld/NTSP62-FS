//GenericsTest.java
package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.comp.Demo;
import com.nt.comp.Employee;
import com.nt.comp.Student;

public class GenericsTest {

	public <T> T getPersonInfo(Class<T> clazz)throws Exception{
	       //get all constructors of the class
		 Constructor cons[]=clazz.getDeclaredConstructors();
		 // create object
		  return (T)cons[0].newInstance();
	}
	
	public static void main(String[] args) {
		try {
		   //create  object
		GenericsTest  gt=new GenericsTest();
		  Employee emp=gt.getPersonInfo(Employee.class);
		  emp.m1(); emp.m2();
		  System.out.println("______________");
		  Student stud=gt.getPersonInfo(Student.class);
		  stud.m1(); stud.m3();
		  System.out.println("___________");
		  
		  Demo dt=gt.getPersonInfo(Demo.class);
		  System.out.println(dt.toString());
		  
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}//main
}//class
