//EmployeeOperationsController.java
package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public   String   processAddEmployeeForm(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs) {
		// use  service
		String msg=service.regisgterEmployee(emp);
		//keep result in model attribute
	   attrs.addFlashAttribute("resultMsg",msg);
		// redirect to other handler method
		 return  "redirect:employee_report";
	}
	
	@GetMapping("/employee_delete")
	public   String  processDeleteEmployee(@RequestParam("no") int no,RedirectAttributes  attrs) {
		//use  service
		String msg=service.deleteEmployee(no);
		//add Redirect attributes
		attrs.addFlashAttribute("resultMsg", msg);
		//redirect to other handler method
		return "redirect:employee_report";
	}
	
	@GetMapping("/employee_edit")
	public  String  showUpdateEmployeeFormPage(@ModelAttribute("emp") Employee emp,@RequestParam("no") int no) {
		
		 // get  Employee record by no
		Employee emp1=service.fetchEmployeeByNo(no);
		//copy  emp1 objet data to emp object
		BeanUtils.copyProperties(emp1, emp);
		//return  LVN
		return "employee_modify";
		
	}
	
	
	@PostMapping("/employee_edit")
	public  String  processUpdateEmployeeFormPage(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs) {
		//use  service
		String msg=service.modifyEmployee(emp);
		// add model attributes to RedirectAttrs object
		attrs.addFlashAttribute("resultMsg", msg);
		//redirect the request to another handler method
		return "redirect:employee_report";
		
		
	}
	


}
