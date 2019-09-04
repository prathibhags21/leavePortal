package com.portal.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.portal.app.dto.Employe;
import com.portal.app.dto.LeaveDetails;
import com.portal.app.service.LeaveReqService;

@Controller
@RequestMapping("/")
public class LeaveReqController {
	
	@Autowired
	private LeaveReqService leaveReqService; 
	
	public LeaveReqController() {
	 System.out.println("leave req created"+this.getClass().getSimpleName());
}


	@RequestMapping(value ="LeaveReq", method = RequestMethod.GET)
	public String leave() {
	System.err.println("inside leave req");
		return "LeaveReq";

	}
	

	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	

	@RequestMapping(value="LeaveReq", method=RequestMethod.POST)
	public ModelAndView leaveRequest(LeaveDetails lev,HttpServletRequest request)
	{
		
		
		System.out.println("Inside leaveRequest Controller");
		try {	
		//	HttpSession session= request.getSession(false);
		//	Employe emp =  (Employe) session.getAttribute("user");
		//	Object emp = session.getAttribute("user");
			
		//	lev.setEmpId(((Employe) emp).getEmpId());
			
             	leaveReqService.leaveRequest(lev);
			return new ModelAndView("index", "msg", "leave applied successfully");
			
		} catch (Exception e) {
		  e.printStackTrace();
		}
		return null;                                                                                                                                                                
			
	}	

}
