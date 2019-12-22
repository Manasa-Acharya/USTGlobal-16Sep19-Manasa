package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BookRegistration;
import com.ustglobal.librarymanagementsystem.dto.UserBean;
@Repository
public class LibraryManagementDaoImpl implements LibraryManegementDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public UserBean login(String email, String password) {
		String jpql = "from UserBean where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<UserBean> query = manager.createQuery(jpql,UserBean.class);

		query.setParameter("email",email);
		query.setParameter("password", password);

		try {
			UserBean userbean = query.getSingleResult();
			return userbean;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}


	}
	@Override
	public UserBean register(UserBean userbean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();


		try{
			transaction.begin();
			manager.persist(userbean);
			transaction.commit();
			return userbean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	
	@Override
	public boolean deleteUser(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserBean userbean = manager.find(UserBean.class, id);
		if(userbean!=null) {
			manager.remove(userbean);
			transaction.commit();
			return true;
		}else {
			
			return false;
		}
		
		
	}
	@Override
	public BookBean addBook(BookBean bookBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(bookBean);
			transaction.commit();
			return bookBean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	@Override
	public boolean deleteBook(int bookId) {
		EntityManager manager = factory.createEntityManager(); 
		EntityTransaction transaction = manager.getTransaction();
		
			transaction.begin();
		BookBean bookBean = manager.find(BookBean.class,bookId); 
			if(bookBean!=null) {
				manager.remove(bookBean);
				transaction.commit();
				return true;
			}else {
				
				return false;
			}
		
	}
	@Override
	public List<BookBean> displayAllBooks() {
		String jpql = "from BookBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BookBean> query = manager.createQuery(jpql,BookBean.class);
		List<BookBean> book = query.getResultList();
		return book;
	}
	@Override
	public BookBean searchBook(int bookId) {
		EntityManager manager = factory.createEntityManager();
		BookBean bean = manager.find(BookBean.class, bookId);
		return bean;
		
	}
//	@Override
//	public boolean modifyBook(BookBean bean) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		BookBean bookBean = manager.find(BookBean.class,bean.getBookId());
//		bookBean.setBookId(bean.getBookId());
//		bookBean.setBookName(bean.getBookName());
//		bookBean.setAuthor(bean.getAuthor());
//		bookBean.setPublisher(bean.getPublisher());
//		bookBean.setYearOfPublication(bean.getYearOfPublication());
//		transaction.commit();
//		
//		return true;
//	}
	@Override
	public UserBean getUser(int id) {
		EntityManager manager = factory.createEntityManager();
		UserBean userBean = manager.find(UserBean.class, id);
		return userBean ;
	}

		
	@Override
	public Boolean requestBook(int bookId) {
		EntityManager manager = factory.createEntityManager(); 
		EntityTransaction transaction = manager.getTransaction();
		
			transaction.begin();
		BookBean bookBean = manager.find(BookBean.class,bookId); 
			if(bookBean!=null) {
				manager.remove(bookBean);
				transaction.commit();
				return true;
			}else {
				
				return false;
			
		}

	}

		
	@Override
	public List<BookRegistration> viewRequest() {
		String jpql = "from BooksRegistration";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BookRegistration> query = manager.createQuery(jpql,BookRegistration.class);
		List<BookRegistration> request = query.getResultList();
		return request;
	}

		
		
	}
		
	



