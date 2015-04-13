package com.javaweb.dao;
import java.util.List;

import com.javaweb.po.TerminReq;


public interface TerminReqDAO extends BaseDAO<TerminReq>{
	public List findRequestbyLeaseId(int sid);
}
