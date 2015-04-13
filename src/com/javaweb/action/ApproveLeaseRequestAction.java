package com.javaweb.action;

import java.util.List;













import org.apache.struts2.ServletActionContext;

import com.javaweb.po.LeaseRequest;
import com.javaweb.service.LeaseRequestService;
import com.opensymphony.xwork2.ActionSupport;

public class ApproveLeaseRequestAction extends ActionSupport {
	private LeaseRequestService leaseRequestService;
	
	public void setLeaseRequestService(LeaseRequestService leaseRequestService) {
		this.leaseRequestService = leaseRequestService;
	}



	@Override
	public String execute() throws Exception {
		List<LeaseRequest> leaseRequests=leaseRequestService.queryAllLeaseRequest();
		ServletActionContext.getRequest().setAttribute("req", leaseRequests);
		return SUCCESS;
	}

}
