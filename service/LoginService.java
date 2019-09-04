package com.portal.app.service;

import java.util.List;
import java.util.Map;


import com.portal.app.dto.Employe;

public interface LoginService {

	public List<Map<String, String>> login(Employe emp);
	
	
}
