package com.javaweb.action;


import com.javaweb.po.ParkingRequest;
import com.javaweb.service.ParkingRequestService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddParkingRequestAction extends ActionSupport{

	private String status;
	private int nearby;
	private String classification;
	private ParkingRequestService parkingRequestService;


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	public int getNearby() {
		return nearby;
	}


	public void setNearby(int nearby) {
		this.nearby = nearby;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public ParkingRequestService getParkingRequestService() {
		return parkingRequestService;
	}


	public void setParkingRequestService(ParkingRequestService parkingRequestService) {
		this.parkingRequestService = parkingRequestService;
	}


	@Override
	public String execute() throws Exception {
		ParkingRequest parkingRequest=new ParkingRequest();
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		String type=(String) ActionContext.getContext().getSession().get("type");
		parkingRequest.setStudentId(user_id);
		
		parkingRequest.setClassification(classification);
		System.out.println(classification);
		
		parkingRequest.setNearby(nearby);
		
		parkingRequest.setStatus("Pending");

		if(parkingRequestService.addParkingRequest(parkingRequest)){
			return SUCCESS; 
		}
		else{
			addActionError("error!");
			return ERROR;
		}
		
	}

	
}