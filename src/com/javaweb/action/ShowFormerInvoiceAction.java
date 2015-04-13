package com.javaweb.action;

import java.util.ArrayList;
import java.util.List;







import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Invoice;
import com.javaweb.po.Lease;
import com.javaweb.service.InvoiceService;
import com.javaweb.service.LeaseService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowFormerInvoiceAction extends ActionSupport {
	private InvoiceService invoiceService;
	private LeaseService leaseService;
	public void setInvoiceService(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}
	

	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}


	@Override
	public String execute() throws Exception {
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		List<Lease> leases=leaseService.queryLeasebyStudentId(user_id);
		List<Invoice> invoices=new ArrayList<Invoice>();
		if (leases!=null) {
			for (Lease lease : leases) {
				invoices.addAll(invoiceService.findFInvoicesbyLeaseId(lease.getId()));
			}
		}
//		List all = invoiceService.queryAllInvoice();
		ServletActionContext.getRequest().setAttribute("all", invoices);
		return SUCCESS;
	}

}
