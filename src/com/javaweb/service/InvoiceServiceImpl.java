package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.InvoiceDAO;
import com.javaweb.po.Invoice;

public class InvoiceServiceImpl implements InvoiceService {
	private InvoiceDAO invoiceDAO;

	public void setInvoiceDAO(InvoiceDAO invoiceDAO) {
		this.invoiceDAO = invoiceDAO;
	}

	// add Student
	@Override
	public boolean addInvoice(Invoice invoice) {
		if (invoiceDAO.queryByID(Invoice.class,invoice.getId()) == null) {
			invoiceDAO.save(invoice);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteInvoice(int id) {
		if (invoiceDAO.queryByID(Invoice.class,id) != null) {
			invoiceDAO.delete(Invoice.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateInvoice(Invoice invoice) {
		if (invoiceDAO.queryByID(Invoice.class,invoice.getId()) != null) {
			invoiceDAO.update(invoice);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllInvoice() {
		return invoiceDAO.queryAll(Invoice.class);
	}

	@Override
	public Invoice queryInvoiceByID(int id) {
		return invoiceDAO.queryByID(Invoice.class,id);
	}

	@Override
	public List queryInvoicebyLeaseId(int lid) {
		// TODO Auto-generated method stub
		return invoiceDAO.findRequestbyLeaseId(lid);
	}
	
	@Override
	public List<Invoice> findCInvoicesbyLeaseId(int lid){
		return invoiceDAO.findCInvoicesbyLeaseId(lid);
	}
	
	@Override
	public List<Invoice> findFInvoicesbyLeaseId(int lid){
		return invoiceDAO.findFInvoicesbyLeaseId(lid);
	}
}
