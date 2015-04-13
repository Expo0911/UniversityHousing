package com.javaweb.action;


import com.javaweb.po.ParkingSpot;
import com.javaweb.po.ParkingSpotOccupy;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.ParkingSpotOccupyService;
import com.javaweb.service.ParkingSpotService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ReturnParkingAction extends ActionSupport{
	private int id;
	private ParkingSpotService parkingSpotService;
	private ParkingSpotOccupyService parkingSpotOccupyService;
	
	


	public void setParkingSpotService(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}

	public void setParkingSpotOccupyService(
			ParkingSpotOccupyService parkingSpotOccupyService) {
		this.parkingSpotOccupyService = parkingSpotOccupyService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		ParkingSpotOccupy parkingOccupy=parkingSpotOccupyService.queryOccupyBySpotId(id);
		if (parkingOccupy==null) {
			return ERROR;
		}
		if(parkingOccupy.getStudentId()==user_id){
			ParkingSpot parkingSpot=parkingSpotService.queryParkingSpotByID(parkingOccupy.getParkingSpotId());
			if (parkingSpotOccupyService.deleteParkingSpotOccupy(parkingOccupy.getId())) {
				parkingSpot.setAvailability(0);
				parkingSpotService.updateParkingSpot(parkingSpot);
				return SUCCESS;
			}
			else {
				return ERROR;
			}
			
		}else {
			return ERROR;
		}
	}



}