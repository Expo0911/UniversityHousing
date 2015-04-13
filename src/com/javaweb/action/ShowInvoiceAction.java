package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Invoice;
import com.javaweb.service.InvoiceService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowInvoiceAction extends ActionSupport {
	private int id;
	
	private InvoiceService invoiceService;
	public void setInvoiceService(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		Invoice invoice = invoiceService.queryInvoiceByID(id);
		ServletActionContext.getRequest().setAttribute("invoice", invoice);
		return SUCCESS;
	}

}