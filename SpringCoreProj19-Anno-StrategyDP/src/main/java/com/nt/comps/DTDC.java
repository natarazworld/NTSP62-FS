//DTDC.java  (Dependent class3)
package com.nt.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Primary
public final class DTDC implements Courier {   //  rule2  (implemetation Courier(I)  
	                                                                                      // -- rule3  taking the class as final class
	 
	
	public DTDC() {
		System.out.println("DTDC: 0-param constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return "order id ::"+orderId +" products are set to deliver using DTDC Courier service";
		}

}
