package com.portal.app.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave")
public class LeaveDetails {
    
	@Id
	@Column(name="EMPID")
	private int empId;
	
	@Column(name="FRMDT")
	private Date frmDt;
	
	@Column(name="TODT")
	private Date toDt;
	
	@Column(name="REMARKS")
	private String remarks;
	
	@Column(name="APPROVED")
	private boolean approved;
	
	
	public int getEmpId() {
		return empId;
	}
	public Date getFrmDt() {
		return frmDt;
	}
	public Date getToDt() {
		return toDt;
	}
	public String getRemarks() {
		return remarks;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setFrmDt(Date frmDt) {
		this.frmDt = frmDt;
	}
	public void setToDt(Date toDt) {
		this.toDt = toDt;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	

	@Override
	public String toString() {
		return "LeaveDetails [empId=" + empId + ", frmDt=" + frmDt + ", toDt=" + toDt + ", remarks=" + remarks
				+ ", approved=" + approved + "]";
	}
}
