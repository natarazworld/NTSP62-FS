//BlueDart.java  (Dependent class2)
package com.nt.comps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("courier")
@Scope("prototype")
public final class BlueDart implements Courier { //  rule2  (implemetation Courier(I)  
                                                                                                   //  -- rule3  taking the class as final class
	 
	
	public BlueDart() {
		System.out.println("BlueDart: 0-param constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return "order id ::"+orderId +" products are set to deliver using BlueDart Courier service";
		}

}
