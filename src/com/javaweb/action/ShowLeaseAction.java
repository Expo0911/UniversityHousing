package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Lease;
import com.javaweb.service.LeaseService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowLeaseAction extends ActionSupport {
	private int id;
	
	private LeaseService leaseService;

	public LeaseService getLeaseService() {
		return leaseService;
	}

	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		Lease lease = leaseService.queryLeaseByID(id);
		ServletActionContext.getRequest().setAttribute("lease", lease);
		return SUCCESS;
	}

}