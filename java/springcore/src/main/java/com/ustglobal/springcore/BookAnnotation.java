package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.config.BookConfiguration;

public class BookAnnotation {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext(BookConfiguration.class)
}
}
