//StudentOperationsController.java
package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {
	
	@GetMapping("/")
	public  String showHome() {
		//return LVN  (home page)
		return "home";
	}
	
	
	@GetMapping("/register")
	public   String   showForm(@ModelAttribute("stud") Student st) {
		//return LVN (form page)
		return "student_register";
		
	}
	
	@PostMapping("/register")
	public String   processForm(@ModelAttribute("stud") Student st) {
		  //processing reuest
            st.setAvg(st.getAvg()+5.0f);		
            //rreturn lvn
            return "result";
	}

}
