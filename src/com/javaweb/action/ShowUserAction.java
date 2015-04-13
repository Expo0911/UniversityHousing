package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.User;
import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserAction extends ActionSupport {
	private int id;

	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		User user = userService.queryUserByID(id);
		ServletActionContext.getRequest().setAttribute("user", user);
		return SUCCESS;
	}





}