package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	
	public boolean deleteStudent(int id);
	
	public boolean updateStudent(Student student);
	
	public List queryAllStudent();
	
	public Student queryStudentByID(int id);
}
