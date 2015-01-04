package com.soni.dao;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.soni.modal.Account;
import com.soni.modal.Book;
import com.soni.modal.BookStock;

@Repository
@Getter
@Setter
public class BookPurchaseDaoImpl implements BookPurchaseDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private TransactionTemplate transactionTemplate;
	
	private Session session;

	private Integer bookId;
	private Integer userId;
	private String userPass;

	@Override
	public void bookPurchase(int bookId, int userId, String userPass) {
		this.setBookId(bookId);
		this.setUserId(userId);
		this.setUserPass(userPass);
		
		// This will handle the transaction and will commit only if all the statements inside doInTransaction() executes successfully. Otherwise transaction will be rolled back.
		transactionTemplate.execute(new TransactionCallBackImpl());
	}
	
	public boolean authenticate(int userId, String userPass) {
		session = sessionFactory.openSession();
		String hql = "select usr.userPass from User usr where usr.userId=:userId";
		Query query = session.createQuery(hql);
		query.setParameter("userId", userId);
		String storedPassword = (String) query.list().get(0);
		if (userPass.equals(storedPassword)) {
			return true;
		}
		return false;
	}

	private final class TransactionCallBackImpl implements TransactionCallback {
		@Override
		public Object doInTransaction(TransactionStatus status) {
			try {
				if (!authenticate(userId, userPass)) {
					throw new Exception("Unauthorized Access");
				}
				session = getSessionFactory().getCurrentSession();
				
				Book book = (Book) session.load(Book.class, bookId);
				BookStock bookStock = (BookStock) session.load(BookStock.class, bookId);
				Account account = (Account) session.load(Account.class, userId);
				
				if(bookStock.getBookStock()==0){
					throw new Exception("This book is out of stock");
				}
				if(account.getBalance()<book.getBookPrice()){
					throw new Exception("You don't have enough balance in your account");
				}
				
				// update book stock, reduce the stock by 1
				bookStock.setBookStock(bookStock.getBookStock() - 1);
				session.update(bookStock);
	
				// update user account, deduct balance
				account.setBalance(account.getBalance() - book.getBookPrice());
				session.update(account);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
	}
	
}
