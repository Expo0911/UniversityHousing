package com.javaweb.action;

import com.javaweb.po.Staff;
import com.javaweb.po.Student;
import com.javaweb.service.FamilyApartmentService;
import com.javaweb.service.GeneralApartmentService;
import com.javaweb.service.ResidenceHallService;
import com.javaweb.service.StaffService;
import com.javaweb.service.StudentService;
import com.javaweb.util.LoginCheck;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public static final String ADMIN = "admin";
	private int id;
	private String password;
	private LoginCheck lc;
	private StudentService studentService;
	private StaffService staffService;

	public LoginCheck getLc() {
		return lc;
	}

	public void setLc(LoginCheck lc) {
		this.lc = lc;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	@Override
	public String execute() {
		Student student = studentService.queryStudentByID(getId());
		Staff staff = staffService.queryStaffByID(getId());
		if (student == null && staff == null) {
			ActionContext.getContext().getSession().put("login", "false");
			return ERROR;
		}
		if (staff == null) {
			if (lc.isLogin(getId(), getPassword(), student.getPassword())) {
				ActionContext.getContext().getSession().put("login", getId());
				ActionContext.getContext().getSession().put("type", student.getType());
				ActionContext.getContext().getSession().put("category", student.getCategory());
				return "student";
			} else {
				ActionContext.getContext().getSession().put("login", "false");
				return ERROR;
			}
		}
		if (student == null) {
			if (lc.isLogin(getId(), getPassword(), staff.getPassword())) {
				ActionContext.getContext().getSession().put("login", getId());
				ActionContext.getContext().getSession().put("type", "admin");
				return "admin";
			} else {
				ActionContext.getContext().getSession().put("login", "false");
				return ERROR;
			}
		}
		return ERROR;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
