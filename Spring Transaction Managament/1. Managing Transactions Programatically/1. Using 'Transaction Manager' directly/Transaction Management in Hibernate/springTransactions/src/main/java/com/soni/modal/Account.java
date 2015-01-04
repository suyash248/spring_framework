package com.soni.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="ACCOUNTS_T")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACCOUNT_ID")
	private Integer accountId;
	
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="BALANCE")
	private Integer balance;
}
