package com.javaweb.action;


import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
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
		if(userService.deleteUser(id)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}