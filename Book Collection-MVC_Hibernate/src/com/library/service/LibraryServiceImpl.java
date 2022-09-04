package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.DAOImpl;
import com.library.model.Author;
import com.library.model.Book;


@Service
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	DAOImpl dao;

	@Override
	@Transactional
	public List<Book> getAllBooks() {	
		return dao.getAllBooks();
	}

	@Override
	@Transactional
	public List<Author> getAllAuthor() {
		return dao.getAllAuthor();
	}

	@Override
	@Transactional
	public Author getAuthorById(int id) {
		return dao.getAuthorById(id);
	}

	@Override
	@Transactional
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	@Transactional
	public void saveBook(Book book) {
		dao.saveBook(book);
		
	}

}
