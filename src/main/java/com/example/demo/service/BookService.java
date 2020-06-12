package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Book;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Book> getAllBooks() {
		List<Book> bookList = new ArrayList<>();
		bookList = bookRepository.findAll();
		// .forEach(bookList::add);
		return bookList;
	}

	public Book getBookById(Integer id) {
		Book book = (Book) bookRepository.findBookById(id);
		return book;

	}

	public Book addBook(Book book) {

		return bookRepository.save(book);
	}

	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);
	}

	public void updateBook(Integer id, Book book) {
		bookRepository.save(book);
	}
	
	
	


}
