//ResidentOperationsService.java
package com.nt.service;

import org.springframework.stereotype.Service;

@Service("roService")
public class ResidentOperationsService {
	
	public  String arrangeLunchForGuest(String guestName,long phone, int guestsCount ) {
		System.out.println("ResidentOperationsService.arrangeLunchForGuest()");
		return " lunch is arranged for "+guestName+" having phoneNumber ::"+phone+" for  "+guestsCount+" members";
	}

}
