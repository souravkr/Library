package com.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.model.Author;
import com.library.model.Book;


public interface LibraryService {
	
	
	public List<Book> getAllBooks();

	public List<Author> getAllAuthor();
	
	public Author getAuthorById(int id);
	
	public Book getBookById(int id);
	
	public void saveBook(Book book);

}
