//Department.java (Dependent class)
package com.nt.sbeans;

import java.util.Date;

public class Department {
	private int dno;
	private String dname;
	private int size;
	private  Date  startDate;
	
	//constructor for constructor Injection (alt+shift+s, o)
	public Department(int dno, String dname, int size,Date startDate) {
		System.out.println("Department:: 3-param constructor");
		this.dno = dno;
		this.dname = dname;
		this.size = size;
		this.startDate=startDate;
	}

	
	
	
	//toString()   (alt+shift+s , s)
	
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", size=" + size + ", startDate=" + startDate + "]";
	}

	
	

}
