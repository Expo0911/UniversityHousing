package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Ticket;


public class TicketDAOImpl extends BaseDAOImpl<Ticket> implements TicketDAO {

	@Override
	public List<Ticket> findTicketsbyStudentId(int sid) {
		// TODO Auto-generated method stub
		return queryByForeignId(Ticket.class, "studentId", sid);
	}
	// save
		
}
