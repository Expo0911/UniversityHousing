package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.ParkingSpot;
import com.javaweb.service.ParkingSpotOccupyService;
import com.javaweb.service.ParkingSpotService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowCParkingSpotAction extends ActionSupport {
	
	private ParkingSpotService parkingSpotService;
	private ParkingSpotOccupyService parkingSpotOccupyService;
	public void setParkingSpotOccupyService(ParkingSpotOccupyService parkingSpotOccupyService) {
		this.parkingSpotOccupyService = parkingSpotOccupyService;
	}
	
	public void setParkingSpotService(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}
	

	@Override
	public String execute() throws Exception {
		int loginId=(Integer) ActionContext.getContext().getSession().get("login");
		int parkingSpotId=parkingSpotOccupyService.findSpotIdbyStudentId(loginId);
		System.out.println((parkingSpotId));
		ParkingSpot parkingSpot;
		if(parkingSpotId==-1)
			parkingSpot=null;
		else
			parkingSpot=parkingSpotService.queryParkingSpotByID(parkingSpotId);
		ServletActionContext.getRequest().setAttribute("parkingSpot", parkingSpot);
		return SUCCESS;
	}

}