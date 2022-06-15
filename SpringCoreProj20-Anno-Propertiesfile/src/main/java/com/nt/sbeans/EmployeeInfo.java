//EmployeeInfo.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("com/nt/commons/Info.properties")
public class EmployeeInfo {
	@Value("${emp.name}")
	private  String name;
	@Value("${emp.age}")
	private  int age;
	@Value("${emp.salary}")
	private double salary;
	@Value("${os.name}")  //fixed system property name
	private  String os;
	@Value("${Path}")  // fixed Env variable name (PATH)
	private   String pathInfo;
	
	
	//toString (alt+shift+s,s)
	@Override
	public String toString() {
		return "EmployeeInfo [name=" + name + ", age=" + age + ", salary=" + salary + ", os=" + os + ", pathInfo="
				+ pathInfo + "]";
	}
	
	
	

}
