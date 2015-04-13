package com.javaweb.service;

import java.util.List;

import com.javaweb.po.TerminReq;

public interface TerminReqService {
	public boolean addTerminReq(TerminReq terminReq);
	
	public boolean deleteTerminReq(int id);
	
	public boolean updateTerminReq(TerminReq terminReq);
	
	public List queryAllTerminReq();
	
	public TerminReq queryTerminReqByID(int id);

	public List queryInvoicebyLeaseId(int id);
}
