package com.javaweb.action;

import java.util.Date;

import com.javaweb.po.Guest;
import com.javaweb.po.Lease;
import com.javaweb.po.Room;
import com.javaweb.po.Student;
import com.javaweb.po.TerminReq;
import com.javaweb.service.GuestService;
import com.javaweb.service.LeaseService;
import com.javaweb.service.RoomService;
import com.javaweb.service.StudentService;
import com.javaweb.service.TerminReqService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTerminAction extends ActionSupport{
	
	private int extraFee;
	private Date inspectionDate;
	private String status;
	private TerminReqService terminReqService;
	private LeaseService leaseService;
	private RoomService roomService;
	private GuestService guestService;
	private StudentService studentService;
	
	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}




	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}




	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}




	public int getExtraFee() {
		return extraFee;
	}




	public void setExtraFee(int extraFee) {
		this.extraFee = extraFee;
	}




	public Date getInspectionDate() {
		return inspectionDate;
	}




	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public void setTerminReqService(TerminReqService terminReqService) {
		this.terminReqService = terminReqService;
	}




	@Override
	public String execute() throws Exception {
		System.out.println(ActionContext.getContext().getParameters());
		int req_id=Integer.parseInt(ActionContext.getContext().getSession().get("req_id").toString());
		TerminReq terminReq=terminReqService.queryTerminReqByID(req_id);
		terminReq.setExtraFee(extraFee);
		terminReq.setInspectionDate(inspectionDate);
		terminReq.setStatus("Approved");
		if(terminReqService.updateTerminReq(terminReq)){
			Lease lease=leaseService.queryLeaseByID(terminReq.getLeaseId());
			if (lease==null) {
				return ERROR;
			}
			lease.setLeaveDate(terminReq.getDate());
			lease.setPenalty((double)terminReq.getExtraFee());
			lease.setStatus("former");
			leaseService.updateLease(lease);
			Room room=roomService.queryRoomByID(lease.getRoomId());
			if (room==null) {
				return ERROR;
			}
			room.setVacancy(0);
			roomService.updateRoom(room);
			Student student=studentService.queryStudentByID(lease.getStudentId());
			Guest guest=guestService.queryGuestByID(lease.getStudentId());
			if (guest!=null) {
				guest.setStatus("unplaced");
			}
			else if (student!=null) {
				student.setStatus("unplaced");
			}
			else return ERROR;
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}
	
}