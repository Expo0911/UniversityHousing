package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Ticket;

public interface TicketService {
	public boolean addTicket(Ticket ticket);
	
	public boolean deleteTicket(int id);
	
	public boolean updateTicket(Ticket ticket);
	
	public List queryAllTicket();
	
	public Ticket queryTicketByID(int id);
	
	public List<Ticket> queryTicketsbyStudentId(int sid);
}
