package com.javaweb.action;


import java.util.Date;

import org.apache.struts2.ServletActionContext;


import com.javaweb.po.Ticket;
import com.javaweb.service.TicketService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FormTicketAction extends ActionSupport {
	private int id;
	private String type; 
	private int studentId;
	private Date date;
	private String location;
	private String description;
	private String status;
	
	private TicketService ticketService;
	
	public TicketService getTicketService() {
		return ticketService;
	}
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String execute() throws Exception {
		Ticket ticket=ticketService.queryTicketByID(id);	
		ticket.setStatus("Complete");
		if(ticketService.updateTicket(ticket)){
			ServletActionContext.getRequest().setAttribute("ticket", ticket);
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
}