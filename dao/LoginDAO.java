package com.portal.app.dao;

import java.util.List;
import java.util.Map;

import com.portal.app.dto.Employe;



public interface LoginDAO {

	public List<Map<String, String>> login(Employe emp);

}
