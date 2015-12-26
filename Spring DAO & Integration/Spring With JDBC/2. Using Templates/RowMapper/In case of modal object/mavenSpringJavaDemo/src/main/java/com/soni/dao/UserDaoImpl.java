package com.soni.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.soni.modal.Student;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate template;
	
	public void displayData(){
		String sql = "select * from STUDENTS_T where STUDENT_ID=?";
		Student student  = template.queryForObject(sql, new Object[]{1}, new StudentMapper());
		System.out.println("ID : "+student.getId() + "\nNAME : "+student.getName());
	}
	
	private static final class StudentMapper implements RowMapper<Student>{

		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getInt(1));	// student.setId(rs.getInt("STUDENT_ID"));	
			student.setName(rs.getString(2));	// student.setName(rs.getString("STUDENT_NAME"));
			return student;
		}
	}
}
