package com.soni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soni.model.UserDetail;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String helloWorld(@ModelAttribute(value="userDetail") UserDetail userDetail) { 
		userDetail.setUsername("Abhi");	// userDetail model object will be placed in a model map after executing this handler method. So we can alter it here.
		return "showDetails.def";
	}
	
	// All the methods that are annotated with @ModelAttribute annotation are executed first and the result of those mthods are stored in temporary map.
	// Then the handler method(s) are executed and after completing the execution of handler method, That temporary map is added to model and can be accessed inside view.
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
