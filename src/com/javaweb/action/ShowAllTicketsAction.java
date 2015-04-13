package com.javaweb.action;

import java.util.ArrayList;
import java.util.List;


import org.apache.struts2.ServletActionContext;
import com.javaweb.po.Ticket;
import com.javaweb.service.TicketService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllTicketsAction extends ActionSupport {
	private TicketService ticketService;
	
	
	public TicketService getTicketService() {
		return ticketService;
	}


	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}


	@Override
	public String execute() throws Exception {
		List ticket = ticketService.queryAllTicket();
//		List all = invoiceService.queryAllInvoice();
		ServletActionContext.getRequest().setAttribute("ticket", ticket);
		return SUCCESS;
	}

}
