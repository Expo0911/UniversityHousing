package com.javaweb.action;


import java.util.Date;

import com.javaweb.po.TerminReq;
import com.javaweb.service.TerminReqService;
import com.javaweb.service.LeaseService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddTerminReqAction extends ActionSupport{
	/**
	 * 
	 */
	private int leaseId;
	private int studentId;
	private String reason;
	private Date date;
	private String status;
	private Date inspectionDate;
	private float extraFee=0;
	private LeaseService leaseService;
	
	
	public LeaseService getLeaseService() {
		return leaseService;
	}

	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getLeaseId() {
		return leaseId;
	}

	public void setLeaseId(int leaseId) {
		this.leaseId = leaseId;
	}




	public String getReason() {
		return reason;
	}




	public void setReason(String reason) {
		this.reason = reason;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
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


	private TerminReqService terminReqService;

	public void setTerminReqService(TerminReqService terminReqService) {
		this.terminReqService = terminReqService;
	}

	@Override
	public String execute() throws Exception {
		TerminReq terminReq  = new TerminReq();
		
		Date datetemp = new Date();
		terminReq.setDate(datetemp);
		String statustemp="pending";
		terminReq.setStatus(statustemp);
		
		int loginId=(Integer) ActionContext.getContext().getSession().get("login");
		terminReq.setStudentId(loginId);
		System.out.println(loginId);
		int leaseid=leaseService.queryCurrentIdbyStudentId(loginId);
		System.out.println("leaseid");
		if(leaseid==-1)
			return ERROR;
		
		//if(lease==null)
		//	return ERROR;
		//System.out.println(lease.getId());
			
		//terminReq.setLeaseId(lease.getId());
		terminReq.setLeaseId(leaseid);
		
		terminReq.setReason(reason);
		terminReq.setInspectionDate(inspectionDate);
		terminReq.setExtraFee(extraFee);
		if(terminReqService.addTerminReq(terminReq))
		{
			return SUCCESS;
		}
		else
		{
			addActionError("error!");
			return ERROR;
		}
		
	}
	
}