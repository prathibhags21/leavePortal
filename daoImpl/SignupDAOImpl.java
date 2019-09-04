package com.portal.app.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.portal.app.dao.SignupDAO;
import com.portal.app.dto.Employe;
import com.portal.app.daoImpl.AbstractDao;
import com.portal.app.dto.Employe;

@Transactional
@Repository
public class SignupDAOImpl implements SignupDAO{
	
	@Autowired
	private SessionFactory factory;
	
	public SignupDAOImpl() {
	 System.out.println("signupdaoimpl created"+this.getClass().getSimpleName());
	}

	
	public void signup(Employe emp)
	{
		System.out.println("inside signupDAOImpl");
	
		
		Session session=null;
		Transaction tx=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			session.save(emp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			session.getTransaction().commit();
			if(session != null)
				session.close();
		}
		
		
		
		
		
		
		
	}
}
