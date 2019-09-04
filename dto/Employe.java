package com.portal.app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Employe")
public class Employe {
	

	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="EMPID")
	private int empId;
	
	@Column(name="USER_NAME")
	private String userName;

	@Column(name="EMAIL")
	private String email;
	
	@Column(name="MOBILE_NO")
	private long mobile;
	
	@Column(name="USER_TYPE")
	private String userType;
	
	@Column(name="PASSWORD")
	private String password;

	public int getEmpId() {
		return empId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public long getMobile() {
		return mobile;
	}

	public String getUserType() {
		return userType;
	}

	public String getPassword() {
		return password;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", userName=" + userName + ", email=" + email + ", mobile=" + mobile
				+ ", userType=" + userType + ", password=" + password + "]";
	}

}
