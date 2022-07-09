//ShoppingStore.java
package com.nt.service;

import org.springframework.stereotype.Component;

@Component("store")
public class ShoppingStore {
	
	public double shopping(String items[],double prices[]) {
		//calculate bill amount
		double billAmt=0.0f;
		for(double p:prices) {
			billAmt=billAmt+p;
		}
		return billAmt;
	}//method

}//class
