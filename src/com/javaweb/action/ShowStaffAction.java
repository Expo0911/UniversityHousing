package com.javaweb.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Staff;
import com.javaweb.service.StaffService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowStaffAction extends ActionSupport{
	private StaffService staffService;

	
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	@Override
	public String execute() throws Exception {
		int loginId=(Integer) ActionContext.getContext().getSession().get("login");
		Staff staff = staffService.queryStaffByID(loginId);
		ServletActionContext.getRequest().setAttribute("staff", staff);
		return SUCCESS;
		
	}
}
