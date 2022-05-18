//PropertiesFileTest.java
package com.nt.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileTest {
    public static void main(String[] args) {
    	// Locate properties file using InputStream
    	try {
    		InputStream is=new FileInputStream("src/main/java/com/nt/commons/Info.properties");
    		//Load data into Properties collection
    		Properties props=new Properties();
    		props.load(is);
    		// display data
    		 System.out.println("props obj data::"+props);
    		 System.out.println("per.name key's  value:: "+props.getProperty("per.name"));
    		 System.out.println("per.age key's value ::"+props.getProperty("per.age"));
    		 
    	}//try
    	catch(FileNotFoundException fnfe) {
    		fnfe.printStackTrace();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		
	}
}
