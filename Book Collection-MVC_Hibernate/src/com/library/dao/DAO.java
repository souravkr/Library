package com.library.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.library.model.Author;
import com.library.model.Book;


public interface DAO {
	
	public List<Book> getAllBooks();

	public List<Author> getAllAuthor();
	
	public Author getAuthorById(int id);
	
	public Book getBookById(int id);
}
