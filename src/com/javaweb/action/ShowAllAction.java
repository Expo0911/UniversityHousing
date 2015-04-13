package com.javaweb.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllAction extends ActionSupport {
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		List all = userService.queryAllUser();
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
