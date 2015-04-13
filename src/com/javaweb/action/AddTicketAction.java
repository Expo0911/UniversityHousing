package com.javaweb.action;


import java.util.Date;

import com.javaweb.po.Ticket;
import com.javaweb.service.TicketService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddTicketAction extends ActionSupport{
	/**
	 * 
	 */
	private String type; 
	private int studentId;
	private Date date;
	private String location;
	private String description;
	private String status;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	private TicketService ticketService;

	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId(){
		return this.studentId;
	}

	public Date getDate() {
		return this.date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String location){
		this.location=location;
	}

	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return this.status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String execute() throws Exception {
		Ticket ticket = new Ticket();
		ticket.setType(type);
		//if(type==null) return ERROR;
		int loginId=(Integer) ActionContext.getContext().getSession().get("login");
		ticket.setStudentId(loginId);
		ticket.setDate(date);
		ticket.setLocation(location);
		ticket.setDescription(description);
		ticket.setStatus("Pending");
		if(ticketService.addTicket(ticket))
		{
			return SUCCESS;
		}
		else
		{
			addActionError("error!");
			return ERROR;
		}
		
	}
	
}