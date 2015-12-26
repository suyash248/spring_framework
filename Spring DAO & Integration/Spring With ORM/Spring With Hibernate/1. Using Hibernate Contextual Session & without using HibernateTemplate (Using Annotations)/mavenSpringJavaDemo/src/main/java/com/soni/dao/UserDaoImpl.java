package com.soni.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.soni.modal.Student;

import lombok.Getter;
import lombok.Setter;

@Repository
@Getter @Setter
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void displayData() {
		Session session = getSessionFactory().openSession();
		String hql = "from Student";
		Query query = session.createQuery(hql);
		List<Student> students = query.list();
		for(Student student : students) {
			System.out.println("ID : "+student.getId() + "\tNAME : "+student.getName());
		}
	}
}
