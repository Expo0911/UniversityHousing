package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Student;
import com.javaweb.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowStudentAction extends ActionSupport {
	private int id;

	
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		Student student = studentService.queryStudentByID(id);
		ServletActionContext.getRequest().setAttribute("student", student);
		return SUCCESS;
	}





}