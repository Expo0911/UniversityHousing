package com.javaweb.action;

import com.javaweb.po.Guest;
import com.javaweb.service.GuestService;
import com.javaweb.util.LoginCheck;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GuestLoginAction extends ActionSupport {
	private int id;
	private String password;
	private LoginCheck lc;
	private GuestService guestService;

	public GuestService getGuestService() {
		return guestService;
	}

	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}

	public LoginCheck getLc() {
		return lc;
	}

	public void setLc(LoginCheck lc) {
		this.lc = lc;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String execute() {
		Guest guest=guestService.queryGuestByID(getId());
		if (guest == null) {
			ActionContext.getContext().getSession().put("login", "false");
			return ERROR;
		}
		else {
			if (lc.isLogin(getId(), getPassword(), guest.getPassword())) {
				ActionContext.getContext().getSession().put("login", getId());
				ActionContext.getContext().getSession().put("type", "guest");
				return "guest";
			} else {
				ActionContext.getContext().getSession().put("login", "false");
				return ERROR;
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
