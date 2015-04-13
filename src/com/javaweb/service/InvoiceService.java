package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Invoice;

public interface InvoiceService {
	public boolean addInvoice(Invoice invoice);
	
	public boolean deleteInvoice(int id);
	
	public boolean updateInvoice(Invoice invoice);
	
	public List queryAllInvoice();
	
	public Invoice queryInvoiceByID(int id);
	
	public List queryInvoicebyLeaseId(int lid);
	
	public List<Invoice> findCInvoicesbyLeaseId(int lid);
	public List<Invoice> findFInvoicesbyLeaseId(int lid);
}
