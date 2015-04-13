package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.TerminReq;

public class TerminReqDAOImpl extends BaseDAOImpl<TerminReq>implements TerminReqDAO {

	@Override
	public List findRequestbyLeaseId(int lid) {
		// TODO Auto-generated method stub
		return queryByForeignId(TerminReq.class, "leaseId", lid);
	}

	

}
