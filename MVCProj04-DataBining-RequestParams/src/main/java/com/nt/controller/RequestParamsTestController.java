//RequestParamsTestController.java
package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamsTestController {
	
	@GetMapping("/")
	public   String showHomePage() {
		
		//return LVN
		return "home";
	}
 
	/*@GetMapping("/report")
	public  String  generateReport(@RequestParam(name="type",defaultValue ="abc") String reportType,
			                                                      @RequestParam("size") int reportSize,
			                                                      @RequestParam("lang")String language) {
		  System.out.println(reportType +"    "+reportSize+"   "+language);
		  
		// return LVN
		  return "result";
		  
	}//method
	*/	
	
	@GetMapping("/report")
	public  String  generateReport(@RequestParam(defaultValue ="abc",required = false) String type,
			                                                      @RequestParam int size,
			                                                      @RequestParam String lang) {
		  System.out.println(type +"    "+size+"   "+lang);
		  
		// return LVN
		  return "result";
		  
	}//method
	
}//class
