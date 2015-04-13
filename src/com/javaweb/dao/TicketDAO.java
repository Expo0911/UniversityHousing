package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Ticket;

public interface TicketDAO extends BaseDAO<Ticket>{
	public List<Ticket> findTicketsbyStudentId(int sid);
}
