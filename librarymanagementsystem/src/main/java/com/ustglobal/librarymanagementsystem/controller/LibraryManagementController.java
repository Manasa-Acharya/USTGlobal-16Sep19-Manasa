package com.ustglobal.librarymanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BookRegistration;
import com.ustglobal.librarymanagementsystem.dto.UserBean;
import com.ustglobal.librarymanagementsystem.dto.UserResponse;
import com.ustglobal.librarymanagementsystem.service.LibraryManagementService;



@CrossOrigin(origins="*",allowCredentials = "true")
@RestController
public class LibraryManagementController {

	@Autowired
	private LibraryManagementService service;
	
	
	
	@PostMapping(path="/login",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();
		UserBean userbean = service.login(bean.getEmail(),bean.getPassword());
		if(userbean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setUserBean(userbean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not found in the DB");
			
		
	}
		return response;
		
}
	
	
	@PostMapping(path = "/register",
			consumes =MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public UserResponse register(@RequestBody UserBean userbean) {
		UserResponse response = new UserResponse();
		if(service.register(userbean)!=null) {
			
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
	
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not found in the DB");
			
		
	}
		return response;
		}
	
	
	@DeleteMapping(path = "/delete/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteUser(@PathVariable("id")int id) {
		UserResponse response = new UserResponse();
		if(service.deleteUser(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted in the DB");
		
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not deleted in the DB");
		}
		
		return response;
	}//end of deleteEmployee
	
	
	@PostMapping(path="/addBook",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)//spring wil convert json object to java oblect
	public UserResponse addBook(@RequestBody BookBean bookBean) {
		UserResponse response = new UserResponse();
		if(service.addBook(bookBean)!= null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book added to the DB");
			response.setBookBean(bookBean);		
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book not added to the DB");
			
		}
		return response;
	}
	@DeleteMapping(path="/deleteBook/{bookId}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteBook(@PathVariable("bookId") int bookId) {
		UserResponse response = new UserResponse();
		
		if(service.deleteBook(bookId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book deleted from the DB");
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book not deleted from the DB");
			
		}
		return response;	
	}
//
	@GetMapping(path="/get-all",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse displayAllBooks(){
		UserResponse response = new UserResponse();
		List<BookBean> books = service.displayAllBooks();
		if(!books.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Books found in the DB");
			response.setBookBeans(books);
         }else {
        	 response.setStatusCode(401);
 			response.setMessage("Failure");
 			response.setDescription("Books not found in the DB");
         }
		return response;
		
	}
	@GetMapping(path="/search/{bookId}",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchBook(@PathVariable("bookId")int bookId) {
		UserResponse response = new UserResponse();
		BookBean books = service.searchBook(bookId);
		if(books!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book found in the DB");
			response.setBookBean(books);
         }else {
        	 response.setStatusCode(401);
 			response.setMessage("Failure");
 			response.setDescription("Book not found in the DB");
         }
		return response;
	}
	
//	@PutMapping(path= "/modify",
//			consumes = MediaType.APPLICATION_JSON_VALUE,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public UserResponse modifyBook(@RequestBody BookBean bean) {
//		UserResponse response = new UserResponse();
//		if(service.modifyBook(bean)) {
//			response.setStatusCode(201);
//			response.setMessage("success");
//			response.setDescription("Data modified in the DB");
//		
//		}else {
//			response.setStatusCode(401);
//			response.setMessage("Filure");
//			response.setDescription("Data not modified in the DB");
//		}
//		return response;
//	}//end of modifyEmployee
	
	
//	@GetMapping(path="/getUser/{id}",
//			produces=MediaType.APPLICATION_JSON_VALUE)
//	public UserResponse getUser(@RequestParam("id")int id) {
//		UserResponse response = new UserResponse();
//		UserBean bean = service.getUser(id);
//		if(bean!=null) {
//			response.setStatusCode(201);
//			response.setMessage("Success");
//			response.setDescription("Book found in the DB");
//			response.setUserBean1(Arrays.asList(bean));
//         }else {
//        	 response.setStatusCode(401);
// 			response.setMessage("Failure");
// 			response.setDescription("Book not found in the DB");
//         }
//		return response;
//	}
	@GetMapping(path="/request/{bookId}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse requestBook(@PathVariable("bookId") int bookId) {
		UserResponse response = new UserResponse();
		if(service.requestBook(bookId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("request sended to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("request not sended to the DB");
			
		}
		return response;
	
}
//	@GetMapping(path="/get-request",
//			produces=MediaType.APPLICATION_JSON_VALUE)
//	public UserResponse viewRequest(){
//		UserResponse response = new UserResponse();
//		List<BookRegistration> books = service.viewRequest();
//		if(!books.isEmpty()) {
//			response.setStatusCode(201);
//			response.setMessage("Success");
//			response.setDescription("request sended to the DB");
//         }else {
//        	 response.setStatusCode(401);
// 			response.setMessage("Failure");
// 			response.setDescription("request not sended to the DB");
//         }
//		return response;
//		
//	}
}
