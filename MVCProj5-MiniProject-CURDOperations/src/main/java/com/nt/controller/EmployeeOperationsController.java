//EmployeeOperationsController.java
package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Employee;
import com.nt.service.IEmployeeServiceMgmt;

@Controller
public class EmployeeOperationsController {
	 @Autowired
	private  IEmployeeServiceMgmt  service;
  
	@GetMapping("/")
	public   String showHomePage() {
		//return  LVN
		return "home";
	}
	
	@GetMapping("/employee_report")
	public  String   showEmployeeReport(Map<String,Object> map) {
		//use service
		List<Employee> list=service.fetchAllEmps();
		// add model attribute to map collection
		map.put("empsData", list);
		//return LVN
		return "show_emp_report";
		
	}
	
	@GetMapping("/employee_add")
	public  String  showAddEmployeeFormPage(@ModelAttribute("emp") Employee emp) {
		//return lvn 
		return "employee_register";
	}
	
	@PostMapping("/employee_add")
	public   String   processAddEmployeeForm(@ModelAttribute("emp") Employee emp, Map<String,Object> map) {
		// use  service
		String msg=service.regisgterEmployee(emp);
		//keep result in model attribute
		map.put("resultMsg", msg);
		// return  LVN
		 return  "redirect:employee_report";
	}

}
