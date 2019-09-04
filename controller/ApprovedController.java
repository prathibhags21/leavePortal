package com.portal.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portal.app.dto.LeaveDetails;
import com.portal.app.service.ApprovedService;

@RequestMapping("/")
@Controller
public class ApprovedController {
	
	@Autowired
	private ApprovedService approvedService;
	
	@RequestMapping("ApproveReqLeave")
	public void appr(LeaveDetails lev)
	{
		
	}

}
