package com.portal.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portal.app.dao.LeaveReqDAO;
import com.portal.app.dto.LeaveDetails;
import com.portal.app.service.LeaveReqService;

@Service
public class LeaveReqServiceImpl implements LeaveReqService {
	
	@Autowired
	private LeaveReqDAO dao;
	
	public LeaveReqServiceImpl() {
		System.out.println("leaveReqserviceimpl created"+this.getClass().getSimpleName());
		}


	public void leaveRequest(LeaveDetails lev) {
		dao.leaveRequest(lev);
		
	}	
}
