package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.StudentDAO;
import com.javaweb.po.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	// add Student
	@Override
	public boolean addStudent(Student student) {
		if (studentDAO.queryByID(Student.class,student.getId()) == null) {
			studentDAO.save(student);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteStudent(int id) {
		if (studentDAO.queryByID(Student.class,id) != null) {
			studentDAO.delete(Student.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateStudent(Student student) {
		if (studentDAO.queryByID(Student.class,student.getId()) != null) {
			studentDAO.update(student);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllStudent() {
		return studentDAO.queryAll(Student.class);
	}

	@Override
	public Student queryStudentByID(int id) {
		return studentDAO.queryByID(Student.class,id);
	}


}
