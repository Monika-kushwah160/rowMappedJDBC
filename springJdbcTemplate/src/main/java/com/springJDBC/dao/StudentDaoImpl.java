package com.springJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springJDBC.entities.Student;

public class StudentDaoImpl implements StudentDao
{
    private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query="insert into student(id,name,city)values(?,?,?)";
		int ans = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return ans;
	}

	
	public int change(Student student) 
	{
		//updating data
		String query = "update student set name=?,city=? where id = ?";
		int res = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}

	public int delete(int studentId) {
		String query = "delete from student where id =?";
		int res = this.jdbcTemplate.update(query,studentId);
		return res;
	}

	
	public Student getstudent(int studentId) 
	{
		//select query
		String query = "select * from student where id =?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		
		return student;
	}

//multiple data select
	public List<Student> getAllStudents()
	
	{
		String query = "select *from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	
}
