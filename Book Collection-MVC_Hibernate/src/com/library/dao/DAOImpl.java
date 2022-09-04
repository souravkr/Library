package com.library.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.model.Author;
import com.library.model.Book;

@Repository
public class DAOImpl implements DAO {
	
	@Autowired
	SessionFactory factory;

	@Override
	public List<Book> getAllBooks() {
	
		Session session = factory.getCurrentSession();
		
		List<Book> books = session.createQuery("from Book",Book.class).getResultList();
		
		return books;
	}

	@Override
	public List<Author> getAllAuthor() {
	   
		Session session = factory.getCurrentSession();
		
		List<Author> authors = session.createQuery("from Author", Author.class).getResultList();
		
		return authors;
	
	}

	@Override
	public Author getAuthorById(int id) {
		
        Session session = factory.getCurrentSession();
        
        Author author = session.get(Author.class, id);
		
		return author;
	}

	@Override
	public Book getBookById(int id) {

       Session session = factory.getCurrentSession();
       
       Book book = session.get(Book.class, id);
		
		return book;
	}

	public void saveBook(Book book) {
		  Session session = factory.getCurrentSession();
		  
		  session.save(book);
		
	}

}
