package com.soni.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.soni.modal.Student;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public UserDaoImpl(){}
	
	public void displayData() {
		String sql = "select * from STUDENTS_T";
		List<Student> students  = template.query(sql, new StudentMapper());
		for(Student student : students)
			System.out.println("ID : "+student.getId() + "\tNAME : "+student.getName());
	}
	
	public void insertStudent(Student student) {
		String sql = "INSERT INTO STUDENTS_T(STUDENT_ID, STUDENT_NAME) VALUES(:id, :name)";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id", student.getId()).addValue("name", student.getName());
		template.update(sql, namedParameters);
		// update() method works fine for insert/delete/update statements. and can also be used with stored procedure.
	}
	
	private static final class StudentMapper implements RowMapper<Student> {
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getInt(1));	// student.setId(rs.getInt("STUDENT_ID"));	
			student.setName(rs.getString(2));	// student.setName(rs.getString("STUDENT_NAME"));
			return student;
		}
	}
}
