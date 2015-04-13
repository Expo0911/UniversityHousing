package com.javaweb.action;


import com.javaweb.service.TerminReqService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteTerminRequestAction extends ActionSupport{
	private int id;
	private TerminReqService terminReqService;
	
	
	
	public TerminReqService getTerminReqService() {
		return terminReqService;
	}

	public void setTerminReqService(TerminReqService terminReqService) {
		this.terminReqService = terminReqService;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		if(terminReqService.deleteTerminReq(id)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}