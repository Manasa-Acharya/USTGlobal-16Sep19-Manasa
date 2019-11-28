package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Book;

public class BookConfiguration {
	
	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("java");
		book.setPrice(300);
		return book;
	}
}
