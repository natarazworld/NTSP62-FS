//FirstFlight.java  (Dependent class4)
package com.nt.comps;

public final class FirstFlight implements Courier {   //  rule2  (implemetation Courier(I)  
	                                                                                      // -- rule3  taking the class as final class
	 
	
	public FirstFlight() {
		System.out.println("FirrstFlight: 0-param constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return "order id ::"+orderId +" products are set to deliver using DTDC Courier service";
		}

}
