package com.soni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soni.model.UserDetail;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String helloWorld() { 
		return "showDetails.def";
	}
	
	@ModelAttribute(value="userDetail")
	public UserDetail initializeUserDetail(){
		UserDetail userDetail = new UserDetail();
		userDetail.setUsername("Suyash");
		userDetail.setEmail("suyash.soni248@gmail.com");
		userDetail.setAge(21);
		userDetail.setPhone("8894617178");
		return userDetail;
	}
}
