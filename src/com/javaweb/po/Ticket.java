package com.javaweb.po;

import java.lang.reflect.Type;
import java.util.Date;

import org.hibernate.validator.jtype.Types;


public class Ticket extends IdEntity<Ticket> {

	private String type; 
	private int studentId;
	private Date date;
	private String location;
	private String description;
	private String status;
	
	public static void main(String[] args){
		Ticket t = new Ticket();
		t.setType("High");
		int rank = t.getRank();
		System.out.println(rank);
	}
	private enum Type{
		HIGH("High",0), MEDIUM("Medium", 1), LOW("Low", 2);
		 private String name;
	     private int index;

	        
	        private Type(String name, int index) {
	            this.name = name;
	            this.index = index;
	        }
	        
	        public int  getIndex(){
	        	return this.index;
	        }
	}
	
	public int getRank(){
		return Type.valueOf(this.type.toUpperCase()).getIndex();
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status=status;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
