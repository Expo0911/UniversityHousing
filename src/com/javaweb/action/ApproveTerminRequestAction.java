package com.javaweb.action;

import java.util.List;



import org.apache.struts2.ServletActionContext;

import com.javaweb.po.TerminReq;
import com.javaweb.service.TerminReqService;
import com.opensymphony.xwork2.ActionSupport;

public class ApproveTerminRequestAction extends ActionSupport {
	private TerminReqService terminReqService;
	public void setTerminReqService(TerminReqService terminReqService) {
		this.terminReqService = terminReqService;
	}

	@Override
	public String execute() throws Exception {
		List<TerminReq> terminReqs=terminReqService.queryAllTerminReq();
		ServletActionContext.getRequest().setAttribute("termin", terminReqs);
		return SUCCESS;
	}

}
