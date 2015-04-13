package com.javaweb.action;

import java.util.Date;

import com.javaweb.po.User;
import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport{
	private int id;
	private String username;
	private String password;
	private int age;
	private Date birth;
	private String type;
	
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


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setAge(age);
		user.setBirth(birth);
		user.setType(type);
		if(userService.updateUser(user)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	
}