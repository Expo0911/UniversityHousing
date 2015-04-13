package com.javaweb.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.javaweb.po.Lease;
import com.javaweb.po.ParkingLot;
import com.javaweb.po.ParkingRequest;
import com.javaweb.po.ParkingSpot;
import com.javaweb.po.ParkingSpotOccupy;
import com.javaweb.service.LeaseService;
import com.javaweb.service.ParkingLotService;
import com.javaweb.service.ParkingRequestService;
import com.javaweb.service.ParkingSpotOccupyService;
import com.javaweb.service.ParkingSpotPriceService;
import com.javaweb.service.ParkingSpotService;
import com.javaweb.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class AssignParkingSpotAction extends ActionSupport {
	private int id;
	private int student_id;
	private int house_id;
	private int spot_id;
	private Date startDate;
	private Date endDate;
	private ParkingLotService parkingLotService;
	private ParkingSpotService parkingSpotService;
	private LeaseService leaseService;
	private StudentService studentService;
	private ParkingRequestService parkingRequestService;
	private ParkingSpotOccupyService parkingSpotOccupyService;
	private ParkingSpotPriceService parkingSpotPriceService;

	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}


	public void setParkingSpotPriceService(
			ParkingSpotPriceService parkingSpotPriceService) {
		this.parkingSpotPriceService = parkingSpotPriceService;
	}


	public void setParkingSpotOccupyService(
			ParkingSpotOccupyService parkingSpotOccupyService) {
		this.parkingSpotOccupyService = parkingSpotOccupyService;
	}


	public void setParkingSpotService(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}


	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}


	public void setParkingLotService(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
	}


	public void setParkingRequestService(ParkingRequestService parkingRequestService) {
		this.parkingRequestService = parkingRequestService;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String execute() throws Exception {
		ParkingRequest parkingRequest=parkingRequestService.queryParkingRequestByID(id);
		if (parkingRequest==null) {
			return ERROR;
		}
		student_id=parkingRequest.getStudentId();
		List<Lease> leases=leaseService.queryLeasebyStudentId(student_id);
		if (leases.size()==0) {
			return "lease";
		}
		else {
			for (Lease lease : leases) {
				if (lease.getStatus().equalsIgnoreCase("current")) {
					house_id=lease.getHouseId();
					startDate=lease.getEnterDate();
					endDate=lease.getLeaveDate();
					break;
				}
			}
		}
		if (house_id==0) {
			return ERROR;
		}
		List<ParkingLot> parkingLots;
		if (parkingRequest.getNearby()==1) {
			parkingLots=parkingLotService.queryNearbyParkingLot(house_id);
		}
		else parkingLots=parkingLotService.queryAllParkingLot();
		if (studentService.queryStudentByID(student_id)==null) {
			parkingLots=parkingLotService.queryGeneralParkingLot();
		}
		System.out.println(parkingLots);
		if (parkingLots.size()==0) {
			return ERROR;
		}
		for (ParkingLot parkingLot : parkingLots) {
			List<ParkingSpot> parkingSpots=parkingSpotService.queryAvlParkingSpotsbyLotId(parkingLot.getId(),parkingRequest.getClassification());
			if (parkingSpots.size()==0) {
				continue;
			}
			else {
				for (ParkingSpot parkingSpot : parkingSpots) {
					spot_id=parkingSpot.getId();
					System.out.println(parkingSpot.getClassification());
					//System.out.println(parkingSpotPriceService.findPricebySpotClassification(parkingSpot.getClassification()));
					
					parkingSpot.setFee(parkingSpotPriceService.findPricebySpotClassification(parkingSpot.getClassification()));
					parkingSpot.setAvailability(1);
					parkingSpot.setStartDate(startDate);
					parkingSpot.setEndDate(endDate);
					parkingSpotService.updateParkingSpot(parkingSpot);
					break;
				}
			}
		}
		if (spot_id==0) {
			return ERROR;
		}
		ParkingSpotOccupy occupy=new ParkingSpotOccupy();
		occupy.setParkingSpotId(spot_id);
		occupy.setStudentId(student_id);
		parkingSpotOccupyService.addParkingSpotOccupy(occupy);
		parkingRequest.setStatus("Processed");
		parkingRequestService.updateParkingRequest(parkingRequest);		
		return SUCCESS;
	}

}
