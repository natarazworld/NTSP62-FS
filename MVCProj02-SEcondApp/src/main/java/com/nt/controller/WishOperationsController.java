//WishOperationsController.java
package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishOperationsController {
	@Autowired
	private IWishMessageService service;

	@RequestMapping("/")
	 public   String showHome() {
		 //return LVN
		 return "home";
	 }
	
	@RequestMapping("/wish")
	public  String   getWishMessage(Map<String,Object> map) {
		//use service
		String msg= service.showWishMessage();
		// add result to model attribute
		map.put("resultMsg", msg);
		//return LVN
		return "show_result";
		
	}
}
