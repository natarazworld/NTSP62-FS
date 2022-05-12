//WishMessageGenerator.java (target spring bean class)
package com.nt.sbeans;

import java.util.Date;

public class WishMessageGenerator {
	  // HAS-A property;
    private   Date  date;
    private  String name;
    
    
    public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
    
    
    /*WishMessageGenerator(Date date) {
	    System.out.println("WishMessageGenerator:1-param constructor :::"+date);
	   this.date=date; 
	  }*/
	 
	
	 //parameterized constructor for constructor Injection (alt+shift+s,o) public
	  WishMessageGenerator(Date date,String name) {
	    System.out.println("WishMessageGenerator:2-param constructor :::"+date);
	    this.date=date;
	   this.name=name; 
	  }
	 
    
	
    
    public void setDate(Date date) {
    	System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public void setName(String name) {
		System.out.println("WishMessageGenerator.setName()");
		this.name = name;
	}

	// b.method
    public  String  showWishMessage(String user) {
    	System.out.println("WishMessageGenerator.showWishMessage() ::"+date+"   "+name);
    	// get current hour of the day
    	int hour=date.getHours(); // gives in 24 hours format (0-23)
    	//generate the wish message
    	if(hour<12)
    		return "Good Morning::"+user;
    	else if(hour<16)
    		return "Good AfterNoon::"+user;
    	else if(hour<20)
    		return "Good Evening::"+user;
    	else
    		return "Good Night::"+user;
    }
    
    
}//class
