//IBankSerivce.java
package com.nt.service;

public interface IBankService {
	public   double   calcSimpleIntrestAmount(double pamt, double rate, double time);
	public   double   calcCompoundIntrestAmount(double pamt, double rate, double time);
}
