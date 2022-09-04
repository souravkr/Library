package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="author")
public class Author {

	@Column(name="author_name")
	String authorName;
	
	@Id
	@Column(name="aid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int authorId;
	
	@Column(name="city")
    String city;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Author() {
		super();
	}
	
	
	
}
