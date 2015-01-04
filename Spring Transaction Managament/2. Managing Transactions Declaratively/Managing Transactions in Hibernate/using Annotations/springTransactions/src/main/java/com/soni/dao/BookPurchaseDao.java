package com.soni.dao;

public interface BookPurchaseDao {
	public void bookPurchase(int bookId, int userId, String userPass) throws Exception;
}
