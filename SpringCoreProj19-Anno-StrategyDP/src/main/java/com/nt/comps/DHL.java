//DHL.java  (Dependent class1)
package com.nt.comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dhl")
@Lazy(true)
public final class DHL implements Courier { //  rule2  (implemetation Courier(I)  
                                                                                           // -- rule3  taking the class as final class
	 
	
	public DHL() {
		System.out.println("DHL: 0-param constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return "order id ::"+orderId +" products are set to deliver using DHL Courier service";
		}

}
