package com.javaweb.action;


import com.javaweb.service.LeaseRequestService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteRequestAction extends ActionSupport{
	private int id;
	private LeaseRequestService leaseRequestService;
	
	
	
	public void setLeaseRequestService(LeaseRequestService leaseRequestService) {
		this.leaseRequestService = leaseRequestService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		if(leaseRequestService.deleteLeaseRequest(id)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}