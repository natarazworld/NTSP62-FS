package com.nt.test;

import java.util.Arrays;

import com.nt.comp.Test;

public class Property_classTest {

	public static void main(String[] args) {
		  Class c1=Test.class;
		  System.out.println("c1 obj class name::"+c1.getClass()+" c1 obj data::"+c1.toString());
		  System.out.println("_________________________________");
		  System.out.println("class name ::"+c1.getName());
		  System.out.println("super class name::"+c1.getSuperclass());
		  System.out.println(" implemented interface names::"+Arrays.toString(c1.getInterfaces()));
		  

	}

}
