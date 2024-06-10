package com.springJDBC.dao;

import java.util.List;

import com.springJDBC.entities.Student;

public interface StudentDao 
{
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getstudent(int studentId);
	public List<Student> getAllStudents();
    
}
