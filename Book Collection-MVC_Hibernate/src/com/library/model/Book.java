package com.library.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;


@Entity
@Table(name="book")
public class Book {

	@Column(name="bid")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int bookId;
	
	@Column(name="book_name")
	@NotEmpty(message="BookName should not be Blank/Empty")
    String bookName;
    
	@Column(name="publish_date")
	@PastOrPresent	
    Date publishedDate;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="author_id")
    Author author;
    
    @Transient
    int aid;
    
    

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", publishedDate=" + publishedDate + ", author="
				+ author + ", aid=" + aid + "]";
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book() {
		super();
	}
    
    
	
}
