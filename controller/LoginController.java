package com.portal.app.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.app.dto.Employe;
import com.portal.app.service.LoginService;


@Controller
@RequestMapping({"/"})
public class LoginController
{
    @Autowired
	private LoginService loginService;
	
	
	public LoginController() {
	 System.out.println("created controller"+this.getClass().getSimpleName());
	}
	
	

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String load() {
	System.err.println("inside");
		return "index";

	}
	
	@RequestMapping(value = "Login", method = RequestMethod.GET)
	public String login1() {
	System.err.println("inside login1");
		return "Login";

	}
	

	@RequestMapping(value = "Login", method = RequestMethod.POST)
	public ModelAndView login(Employe emp ,HttpServletRequest request)
	
	{
		
		System.out.println("inside login controller");
		System.out.println(emp.toString());
		
		List<Map<String, String>> finalobj = loginService.login(emp);
		
		System.out.println("db->" + finalobj.size());
		if (finalobj.size() > 0 ) {
	 	
						if (emp.getPassword().toString().equalsIgnoreCase(finalobj.get(0).get("PASSWORD")) || 
								emp.getEmail().toString().equalsIgnoreCase(finalobj.get(0).get("email")) )
						{
							String s=finalobj.get(0).get("USER_TYPE");
							System.out.println("login successfull");
							HttpSession session= request.getSession(true);
							session.setAttribute("user", finalobj);
							
						if(s.equals("admin"))
						{
							return new ModelAndView("Signup", "msg", "login successfull").addObject("Employe", finalobj);
							
						}
						else if(s.equals("user")){
							
							return new ModelAndView("LeaveReq", "msg", "login successfull").addObject("Employe", finalobj);
						}
						else if(s.equals("manager")){
							
							return new ModelAndView("ApproveReqLeave", "msg", "login successfull").addObject("Employe", finalobj);
						}
		
							
						else{
						System.out.println("wrong password");
						return new ModelAndView("Login", "msg", "wrong password");		
						}
						
						  }   
					else 
					{
						System.out.println("wrong email");
						return new ModelAndView("Login", "msg1", "wrong email");
					}
		
	     
		 
		}
		return null;
	
	
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

