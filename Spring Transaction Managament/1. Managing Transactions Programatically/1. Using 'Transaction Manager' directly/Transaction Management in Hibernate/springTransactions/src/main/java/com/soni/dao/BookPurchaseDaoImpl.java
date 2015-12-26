package com.soni.dao;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

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
	private PlatformTransactionManager transactionManager;
	
	private Session session;

	@Override
	public void bookPurchase(int bookId, int userId, String userPass) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);

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
	
	private boolean authenticate(int userId, String userPass) {
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
}
