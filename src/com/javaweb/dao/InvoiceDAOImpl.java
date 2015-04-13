package com.javaweb.dao;

import java.util.ArrayList;
import java.util.List;

import com.javaweb.po.Invoice;

public class InvoiceDAOImpl extends BaseDAOImpl<Invoice>implements InvoiceDAO {
	@Override
	public List findRequestbyLeaseId(int lid) {
		// TODO Auto-generated method stub
		return queryByForeignId(Invoice.class, "leaseId", lid);
	}
	@Override
	public List<Invoice> findCInvoicesbyLeaseId(int lid){
		List<Invoice> invoices=this.queryByForeignId(Invoice.class, "leaseId", lid);
		List<Invoice> cInvoices=new ArrayList<Invoice>();
		if(invoices!=null){
			for (Invoice element : invoices) // or sArray
	        {
	               if(element.getStatus().equals("current"))
	               	cInvoices.add(element);    	
	        }
		}
		
		return cInvoices;
	};
	
	@Override
	public List<Invoice> findFInvoicesbyLeaseId(int lid){
		List<Invoice> invoices=this.queryByForeignId(Invoice.class, "leaseId", lid);
		List<Invoice> fInvoices=new ArrayList<Invoice>();
		if(invoices!=null){
			for (Invoice element : invoices) // or sArray
	        {
	               if(element.getStatus().equals("former"))
	               	fInvoices.add(element);    	
	        }
		}
		
		return fInvoices;
	}

}
