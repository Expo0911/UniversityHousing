package com.javaweb.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.javaweb.po.ResidenceHall;
import com.javaweb.po.LeaseRequest;
import com.javaweb.service.LeaseRequestService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddRequestAction extends ActionSupport{
	private int studentId;
	public static final String APT="Apartment";
	public static final String FAMILY="Family Apartment";
	public static final String HALL="Residence Hall";
	public static final String SPECIFIC="Specific Hall";
	public static final String OFF="Off Campus";
	private List <ResidenceHall> residenceHalls=new ArrayList<ResidenceHall> ();
	private String preference1;
	private String preference2;
	private String preference3;
	private String status;
	private String paymentMethod;
	private Date startDate;
	private Date endDate;
	private List<String> selectList;
	private LeaseRequestService leaseRequestService;
	public String handleString(String str) {
		String [] strings=str.split(",");
		if (!strings[0].equals(SPECIFIC)) {
			return strings[0];
		}
		else {
			return strings[1].trim();
		}
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getPreference1() {
		return preference1;
	}


	public void setPreference1(String preference1) {
		this.preference1 = preference1;
	}


	public String getPreference2() {
		return preference2;
	}


	public void setPreference2(String preference2) {
		this.preference2 = preference2;
	}


	public String getPreference3() {
		return preference3;
	}


	public void setPreference3(String preference3) {
		this.preference3 = preference3;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public LeaseRequestService getLeaseRequestService() {
		return leaseRequestService;
	}


	public void setLeaseRequestService(LeaseRequestService leaseRequestService) {
		this.leaseRequestService = leaseRequestService;
	}



	@Override
	public String execute() throws Exception {
		LeaseRequest leaseRequest=new LeaseRequest();
		leaseRequest.setStudentId((Integer)ActionContext.getContext().getSession().get("login"));
		leaseRequest.setPreference1(handleString(preference1));
		leaseRequest.setPreference2(handleString(preference2));
		leaseRequest.setPreference3(handleString(preference3));
		leaseRequest.setStartDate(startDate);
		leaseRequest.setEndDate(endDate);
		leaseRequest.setPaymentMethod(paymentMethod);
		leaseRequest.setStatus("Pending");
		
		if(leaseRequestService.addLeaseRequest(leaseRequest)){
			return SUCCESS; 
		}else{
			addActionError("error!");
			return ERROR;
		}
		
	}

	
}