package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Invoice;

public interface InvoiceDAO extends BaseDAO<Invoice>{
	public List findRequestbyLeaseId(int lid);
	public List<Invoice> findCInvoicesbyLeaseId(int lid);
	public List<Invoice> findFInvoicesbyLeaseId(int lid);
}
