package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Guest;
import com.javaweb.service.GuestService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowGuestAction extends ActionSupport {
	private int id;

	
	private GuestService guestService;
	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		Guest guest = guestService.queryGuestByID(id);
		ServletActionContext.getRequest().setAttribute("guest", guest);
		return SUCCESS;
	}





}