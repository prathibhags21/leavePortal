package com.portal.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.app.dao.SignupDAO;
import com.portal.app.dto.Employe;
import com.portal.app.service.SignupService;

@Service
public class signupServiceImpl implements SignupService {
	
	@Autowired
	private SignupDAO dao;
	
	public signupServiceImpl() {
	  System.out.println("signup serviceimpl created"+this.getClass().getSimpleName());
	}
    
	public void signup(Employe emp)
	{
		dao.signup(emp);
	}
	
	
	
}
