package com.soni.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.soni.model.UserDetail;

@SessionAttributes(value="userDetail")
@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showLoginForm(){
		return "loginForm.def";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String submitForm(HttpServletRequest request, HttpSession session){
		UserDetail userDetail = new UserDetail();
		userDetail.setUsername(request.getParameter("username"));
		userDetail.setEmail(request.getParameter("email"));
		userDetail.setAge(Integer.parseInt(request.getParameter("age")));
		userDetail.setPhone(request.getParameter("phone"));
		
		session.setAttribute("userDetail", userDetail);
		
		return "user.def";
	}
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public String showDetail(@ModelAttribute(value="userDetail") UserDetail userDetail) { 
		// userDetail model object will be pre populated with values from session as we are using @SessionAttribute
		userDetail.setUsername("Abhi");
		return "showDetails.def";
	}
	
}
