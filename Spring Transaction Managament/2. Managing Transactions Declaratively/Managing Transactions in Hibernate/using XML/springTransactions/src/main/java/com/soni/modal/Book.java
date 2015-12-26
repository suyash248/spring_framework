package com.soni.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
@Table(name="BOOKS_T")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BOOK_ID")
	private Integer bookId;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="BOOK_PRICE")
	private Integer bookPrice;
	
}
