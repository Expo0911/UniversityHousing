package com.javaweb.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.javaweb.service.TicketService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowTicketStatusAction extends ActionSupport{
	private TicketService ticketService;

	
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@Override
	public String execute() throws Exception {
		
		int loginId=(Integer) ActionContext.getContext().getSession().get("login");
		System.out.println("login_id"+loginId);
//		List allticket = ticketService.queryAllTicket();
		List allticket=ticketService.queryTicketsbyStudentId(loginId);
		System.out.println("ticket");
		ServletActionContext.getRequest().setAttribute("all", allticket);
		return SUCCESS;
		
	}
}
