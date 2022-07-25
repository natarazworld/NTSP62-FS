//WishMessageServiceImpl.java
package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;

@Controller
public class WishMessageServiceImpl implements IWishMessageService {


	@Override
	public String showWishMessage() {
	 //get System date and timne
		LocalDateTime  ldt=LocalDateTime.now();
	  //get current hour of the day
		int hour=ldt.getHour();  // 0-23 hours
		//get wish message
		 if(hour<12)
			 return "Good Morning";
		 else if(hour<16)
			 return "Good  afternoon";
		 else if(hour<20)
			 return "Good  evening";
		 else
			 return "Good Night";
		 
		 
		 
				
		}

}
