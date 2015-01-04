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
@Table(name="BOOK_STOCKS_T")
public class BookStock {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STOCK_ID")
	private Integer stockId;
	
	@Column(name="BOOK_ID")
	private Integer bookId;
	
	@Column(name="BOOK_STOCK")
	private Integer bookStock;
}
