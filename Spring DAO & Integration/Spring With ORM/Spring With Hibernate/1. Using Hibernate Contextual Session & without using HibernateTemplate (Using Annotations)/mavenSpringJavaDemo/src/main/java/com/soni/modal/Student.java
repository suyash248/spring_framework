package com.soni.modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="STUDENTS_T")
@Getter @Setter
public class Student {
	
	@Id
	@Column(name="STUDENT_ID")
	private int id;
	
	@Column(name="STUDENT_NAME")
	private String name;
	
	public Student(){}
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}
