package com.javaweb.action;

import java.util.ArrayList;
import java.util.List;


import org.apache.struts2.ServletActionContext;
import com.javaweb.po.ParkingRequest;
import com.javaweb.service.ParkingRequestService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllParkingRequestAction extends ActionSupport {
	private ParkingRequestService parkingRequestService;
	
	
	public ParkingRequestService getParkingRequestService() {
		return parkingRequestService;
	}


	public void setParkingRequestService(ParkingRequestService parkingRequestService) {
		this.parkingRequestService = parkingRequestService;
	}


	@Override
	public String execute() throws Exception {
		List parkingRequest = parkingRequestService.queryAllParkingRequest();
//		List all = invoiceService.queryAllInvoice();
		ServletActionContext.getRequest().setAttribute("parkingRequest", parkingRequest);
		return SUCCESS;
	}

}
