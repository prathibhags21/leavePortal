package com.portal.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.app.dao.ApprovedDAO;
import com.portal.app.dto.LeaveDetails;
import com.portal.app.service.ApprovedService;

@Service
public class ApprovedServiceImpl implements ApprovedService {
	
	@Autowired
	private ApprovedDAO dao;
	
	public void appr(LeaveDetails lev)
	{
		
	}

}
