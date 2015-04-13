package com.javaweb.action;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Ticket;
import com.javaweb.service.TicketService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowTicketAction extends ActionSupport{
	private int id;
	private TicketService ticketService;

	
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	@Override
	
	public String execute() throws Exception {
		System.out.println("ticket"+id);
		Ticket ticket = ticketService.queryTicketByID(id);
		ServletActionContext.getRequest().setAttribute("ticket", ticket);
		return SUCCESS;
	}
}

