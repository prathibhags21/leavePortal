package com.portal.app.daoImpl;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.portal.app.dao.LeaveReqDAO;
import com.portal.app.dto.LeaveDetails;

@Transactional
@Repository
public class LeaveReqDAOImpl extends AbstractDao<String, LeaveDetails> implements LeaveReqDAO {

//	@Autowired
//	private SessionFactory factory;
	
	public LeaveReqDAOImpl() {
		System.out.println(" leavereqDaoImpl created"+this.getClass().getSimpleName());
	}
	
	public void leaveRequest(LeaveDetails lev)
	{
		System.out.println("inside leaveReqDAOImpl");		
		try {
			Session session = getSession();
		//System.err.println("session is null   "+session);
			String query = "insert into assign.leave (EMPID,FRMDT,TODT,REMARKS) values(?,?,?,?) ";
			SQLQuery qry = session.createSQLQuery(query);
			
			qry.setInteger(0, lev.getEmpId());
			qry.setDate(1, lev.getFrmDt());
			qry.setDate(2, lev.getToDt());
			qry.setString(3, lev.getRemarks());
				
		int i=	qry.executeUpdate();
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
		}
	
	}
	}		
	



