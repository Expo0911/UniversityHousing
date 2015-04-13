package com.javaweb.action;

import java.util.ArrayList;
import java.util.List;










import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Lease;
import com.javaweb.po.LeaseRequest;
import com.javaweb.po.TerminReq;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.LeaseService;
import com.javaweb.service.TerminReqService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllRequestAction extends ActionSupport {
	private LeaseRequestService leaseRequestService;
	private TerminReqService terminReqService;
	private LeaseService leaseService;

	
	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}

	public void setLeaseRequestService(LeaseRequestService leaseRequestService) {
		this.leaseRequestService = leaseRequestService;
	}

	public void setTerminReqService(TerminReqService terminReqService) {
		this.terminReqService = terminReqService;
	}

	@Override
	public String execute() throws Exception {
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		List<LeaseRequest> leaseRequests=leaseRequestService.queryLeaseRequestByStudentId(user_id);
		List<Lease> leases=leaseService.queryLeasebyStudentId(user_id);
		List<TerminReq> terminReqs=new ArrayList<TerminReq>();
		if (leases!=null) {
			for (Lease lease : leases) {
				terminReqs.addAll(terminReqService.queryInvoicebyLeaseId(lease.getId()));
			}
		}
//		List all = invoiceService.queryAllInvoice();
		ServletActionContext.getRequest().setAttribute("req", leaseRequests);
		ServletActionContext.getRequest().setAttribute("termin", terminReqs);
		return SUCCESS;
	}

}
