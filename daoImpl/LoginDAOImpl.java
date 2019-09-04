package com.portal.app.daoImpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.portal.app.dao.LoginDAO;
import com.portal.app.dto.Employe;
@Transactional
@Repository
public class LoginDAOImpl extends AbstractDao<String, Employe> implements LoginDAO {
	
	public LoginDAOImpl()
	{
		System.out.println("logindaoimpl created"+this.getClass().getSimpleName());
	}


	public  List<Map<String, String>> login(Employe  emp)
	{
		System.err.println("login dto   "+emp.getEmail());
		Session session = getSession();
		
		
		System.err.println("session  is null or not "+session);
		Employe db = new Employe();
		String sql = "select * from Employe where EMAIL =? ";
		List<Map<String, String>> finallist = new ArrayList<Map<String, String>>();
		
		 SQLQuery qry = session.createSQLQuery(sql);
			qry.setString(0, emp.getEmail());
			if (qry.list().size() > 0) {
				qry.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
				System.err.println("final list"+qry.list());
				finallist = qry.list();
			}
			System.out.println("list   "+finallist.toString());
			return finallist;
			
		}
	
	
	
	
	
	
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


