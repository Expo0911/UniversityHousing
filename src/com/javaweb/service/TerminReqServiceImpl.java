package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.TerminReqDAO;
import com.javaweb.po.TerminReq;

public class TerminReqServiceImpl implements TerminReqService {
	private TerminReqDAO terminReqDAO;

	public void setTerminReqDAO(TerminReqDAO terminReqDAO) {
		this.terminReqDAO = terminReqDAO;
	}

	// add TerminReq
	@Override
	public boolean addTerminReq(TerminReq terminReq) {
		if (terminReqDAO.queryByID(TerminReq.class,terminReq.getId()) == null) {
			terminReqDAO.save(terminReq);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteTerminReq(int id) {
		if (terminReqDAO.queryByID(TerminReq.class,id) != null) {
			terminReqDAO.delete(TerminReq.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateTerminReq(TerminReq terminReq) {
		if (terminReqDAO.queryByID(TerminReq.class,terminReq.getId()) != null) {
			terminReqDAO.update(terminReq);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllTerminReq() {
		return terminReqDAO.queryAll(TerminReq.class);
	}

	@Override
	public TerminReq queryTerminReqByID(int id) {
		return terminReqDAO.queryByID(TerminReq.class,id);
	}

	@Override
	public List queryInvoicebyLeaseId(int id) {
		// TODO Auto-generated method stub
		return terminReqDAO.findRequestbyLeaseId(id);
	}


}
