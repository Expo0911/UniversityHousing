package com.javaweb.action;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.ParkingLot;
import com.javaweb.po.ParkingSpot;
import com.javaweb.service.ParkingLotService;
import com.javaweb.service.ParkingSpotOccupyService;
import com.javaweb.service.ParkingSpotService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowCurrentParkingLotAction extends ActionSupport {
	private ParkingLotService parkingLotService;
    private ParkingSpotOccupyService parkingSpotOccupyService;
    private ParkingSpotService parkingSpotService;
	
	public void setParkingSpotOccupyService(
			ParkingSpotOccupyService parkingSpotOccupyService) {
		this.parkingSpotOccupyService = parkingSpotOccupyService;
	}


	public void setParkingSpotService(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}


	public void setParkingLotService(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
	}


	@Override
	public String execute() throws Exception {
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		int spot_id=parkingSpotOccupyService.findSpotIdbyStudentId(user_id);
		if (spot_id==-1) {
			return ERROR;
		}
		ParkingSpot parkingSpot=parkingSpotService.queryParkingSpotByID(spot_id);
		if (parkingSpot==null) {
			return ERROR;
		}
		int lot_id=parkingSpot.getLotId();
		ParkingLot parkingLot=parkingLotService.queryParkingLotByID(lot_id);
		ServletActionContext.getRequest().setAttribute("lot", parkingLot);
		
		return SUCCESS;
	}

}
