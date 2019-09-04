package com.portal.app.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portal.app.dao.LoginDAO;
import com.portal.app.dto.Employe;
import com.portal.app.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO dao;
	

	public LoginServiceImpl() {
		System.out.println("loginserviceimpl created"+this.getClass().getSimpleName());
	}
	
	
	public List<Map<String, String>> login(Employe emp) {
		List<Map<String, String>> list = dao.login(emp);	
	return list;	
	
	}
	
	
	
	
	

}
