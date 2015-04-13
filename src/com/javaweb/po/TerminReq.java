package com.javaweb.po;

import java.util.Date;


public class TerminReq extends IdEntity<TerminReq> {
	
	private int studentId;
	private int leaseId;
	private String reason;
	private Date date;
	private String status;
	private Date inspectionDate;
	private float extraFee;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public float getExtraFee() {
		return extraFee;
	}
	public void setExtraFee(float extraFee) {
		this.extraFee = extraFee;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getLeaseId() {
		return leaseId;
	}
	public void setLeaseId(int leaseId) {
		this.leaseId = leaseId;
	}
}