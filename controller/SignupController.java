package com.portal.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.app.dto.Employe;
import com.portal.app.service.SignupService;


@Controller
@RequestMapping("/")
public class SignupController {
	
	@Autowired
	private SignupService signupservice;
	
	public SignupController() {
		System.out.println("signup controller created"+this.getClass().getSimpleName());
	}


	@RequestMapping(value ="Signup", method = RequestMethod.GET)
	public String signupp() {
	System.err.println("inside signup");
		return "Signup";

	}
	
	
	@RequestMapping(value="Signup", method=RequestMethod.POST)
	public ModelAndView signup(Employe emp)
	{
		
		System.out.println("Inside Controller");
		try {
			
			signupservice.signup(emp);
			return new ModelAndView("Signup", "success", "User inserted successfully");
			
		} catch (Exception e) {
		  e.printStackTrace();
		}
		return null;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
