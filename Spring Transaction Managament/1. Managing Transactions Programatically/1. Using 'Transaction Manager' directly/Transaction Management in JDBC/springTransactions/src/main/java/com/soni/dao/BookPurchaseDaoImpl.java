package com.soni.dao;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Repository
@Getter
@Setter
public class BookPurchaseDaoImpl extends NamedParameterJdbcDaoSupport implements
		BookPurchaseDao {

	private PlatformTransactionManager transactionManager;

	@Override
	public void bookPurchase(int bookId, int userId, String userPass) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);

		String sql = "";
		Map<String, Integer> paramMap;
		try {
			if (!authenticate(userId, userPass)) {
				throw new Exception("Unauthorized Access");
			}
			
			int bookPrice = getBookPrice(bookId);
			int bookStock = getBookStock(bookId);
			int userAccountBalance = getUserAccountBalance(userId);
				
			if(bookStock==0){
				throw new Exception("This book is out of stock");
			}
			if(userAccountBalance<bookPrice){
				throw new Exception("You don't have enough balance in your account");
			}
			
			paramMap = new HashMap<String, Integer>();
			paramMap.put("bookId", bookId);
			
			// update book stock
			sql = "UPDATE BOOK_STOCKS_T SET BOOK_STOCK = BOOK_STOCK-1 WHERE BOOK_ID=:bookId";
			getNamedParameterJdbcTemplate().update(sql, paramMap);

			// update user account, deduct balance
			sql = "UPDATE ACCOUNTS_T SET BALANCE = BALANCE - :bookPrice WHERE USER_ID = :userId";
			paramMap.put("bookPrice", bookPrice);
			paramMap.put("userId", userId);
			getNamedParameterJdbcTemplate().update(sql, paramMap);

			// commit the transaction
			transactionManager.commit(status);
			System.out.println("TRANSACTION COMPLETED SUCCESSFULLY");
		} catch (Exception e) {
			// rollback the transaction
			transactionManager.rollback(status);
			System.out.println("TRANSACTION FAILED");
			e.printStackTrace();
		}
	}
	
	@Override
	public int getBookPrice(int bookId){
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("bookId", bookId);
		String sql = "SELECT BOOK_PRICE FROM BOOKS_T WHERE BOOK_ID=:bookId";
		int bookPrice = getNamedParameterJdbcTemplate().queryForObject(
				sql, paramMap, Integer.class);
		return bookPrice;
	}
	
	@Override
	public int getUserAccountBalance(int userId) {
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("userId", userId);
		String sql = "SELECT BALANCE FROM ACCOUNTS_T WHERE USER_ID=:userId";
		int balance = getNamedParameterJdbcTemplate().queryForObject(
				sql, paramMap, Integer.class);
		return balance;
	}
	
	@Override
	public int getBookStock(int bookId) {
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("bookId", bookId);
		String sql = "SELECT BOOK_STOCK FROM BOOK_STOCKS_T WHERE BOOK_ID=:bookId";
		int bookStock = getNamedParameterJdbcTemplate().queryForObject(
				sql, paramMap, Integer.class);
		return bookStock;
	}
	
	private boolean authenticate(int userId, String userPass) {
		String sql = "SELECT USER_PASS FROM USERS_T WHERE USER_ID=:userId";
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("userId", userId);
		String storedPassword = getNamedParameterJdbcTemplate().queryForObject(
				sql, paramMap, String.class);
		if (userPass.equals(storedPassword)) {
			return true;
		}
		return false;
	}
}
