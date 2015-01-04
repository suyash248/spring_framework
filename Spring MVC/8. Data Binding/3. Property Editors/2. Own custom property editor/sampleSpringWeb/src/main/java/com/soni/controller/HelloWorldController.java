package com.soni.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.soni.customPropertyEditor.UsrCustomPropertyEditor;
import com.soni.model.UserDetail;

@Controller
public class HelloWorldController {
	
	@InitBinder("userDetail")
	public void myInitBinder(WebDataBinder binder){
		SimpleDateFormat customFormat = new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(customFormat, false)); 
		UserDetail userDetail = (UserDetail) binder.getTarget(); // Line 33
		binder.registerCustomEditor(String.class, "username", new UsrCustomPropertyEditor(userDetail));
	}
	
	// We need to populate the 'userDetail' model(command) object before retrieving it at Line 33 in myInitBinder().
	@ModelAttribute
	public UserDetail initUserDetail(@ModelAttribute(value="userDetail") UserDetail userDetail){
		return userDetail;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginForm(Model model){
		model.addAttribute("userDetail", new UserDetail());
		return "loginForm.def";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String showDetail(@Valid @ModelAttribute(value="userDetail") UserDetail userDetail, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			return "loginForm.def";
		}
		return "showDetails.def";
	}
	
}
