package com.soni.dao;


public interface BookPurchaseDao {
	public void bookPurchase(int bookId, int userId, String userPass);
	public int getBookPrice(int bookId);
	public int getUserAccountBalance(int userId);
	public int getBookStock(int bookId);
}
