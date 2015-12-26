package com.soni.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate template;
	
	public void displayData(){
		String sql = "select STUDENT_NAME from STUDENTS_T where STUDENT_ID=1";
		System.out.println(template.queryForObject(sql, String.class));
	}
}
