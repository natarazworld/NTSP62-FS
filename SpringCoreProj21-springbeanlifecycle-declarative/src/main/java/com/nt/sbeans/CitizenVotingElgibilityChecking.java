//CitizenVotingElgibilityChecking.java
package com.nt.sbeans;

import java.util.Date;

public class CitizenVotingElgibilityChecking {
	private  String name;
	private  int age;
	 private  String addrs;
	 private  Date  dov;
	 
	 public CitizenVotingElgibilityChecking() {
		System.out.println("CitizenVotingElgibilityChecking:: 0-param constructotr");
	}
	 
	 //setter methods for setter Injection
	 public void setName(String name) {
		 System.out.println("CitizenVotingElgibilityChecking.setName()");
			this.name = name;
		}
		public void setAge(int age) {
			System.out.println("CitizenVotingElgibilityChecking.setAge()");
			this.age = age;
		}
		public void setAddrs(String addrs) {
			System.out.println("CitizenVotingElgibilityChecking.setAddrs()");
			this.addrs = addrs;
		}
		
		//init life cycle method or custom init method
		public  void myInit() {
			System.out.println("CitizenVotingElgibilityChecking.myInit()");
			 //initializating the left over properties
			  dov=new Date();
			//veryfing the injected  vlaues of mandatory properties
			 if(name==null || age<=0)
				 throw new IllegalArgumentException("invalid inputs for age, name");
		}
		
		
		//destroy life cycle method or custom destroy method
		 public void myDestroy() {
			 System.out.println("CitizenVotingElgibilityChecking.myDestroy()");
			   name=null;
			   age=0;
			   addrs=null;
			   dov=null;
			   
		 }
		
		
		

		 //b.method
		public    String checkVotingElgibility() {
			System.out.println("CitizenVotingElgibilityChecking.checkVotingElgibility()");
			if(age<18)
				return "Mr/Mrs/Miss::"+ name+"  u r not elgible for voting . verified on "+dov;
			else
				return "Mr/Mrs/Miss::"+ name+"  u r  elgible for voting . verified on "+dov;
		}

}
