package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BookRegistration;
import com.ustglobal.librarymanagementsystem.dto.UserBean;

public interface LibraryManegementDAO {

	public UserBean login(String email,String password);
	public UserBean register(UserBean userbean);
	public boolean deleteUser(int id);
	public BookBean addBook(BookBean bookBean );
	public boolean deleteBook(int bookId);
	public List<BookBean> displayAllBooks();
	public BookBean searchBook(int bookId);
//	public boolean modifyBook(BookBean bean);
	public UserBean getUser(int id);
	public Boolean requestBook(int bookId);
	public List<BookRegistration> viewRequest() ;
}
