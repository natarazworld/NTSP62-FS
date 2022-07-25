//HomeOperationsController.java
package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeOperationsController {
	
	/*@RequestMapping("/welcome")
	public String showHome() {
		return "home";
	}*/
	
	@RequestMapping("/welcome")
	public String showHome(Map<String,Object> map) {
		System.out.println("Shared Memory obj name::"+map.getClass());
		//add model attributes
		 map.put("sysDate",new Date());
		 map.put("favColor","red");
		return "home";
	}

}
