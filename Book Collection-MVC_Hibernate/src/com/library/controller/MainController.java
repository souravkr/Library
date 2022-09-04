package com.library.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.library.model.Author;
import com.library.model.Book;
import com.library.service.LibraryService;

@Controller
@RequestMapping("/library")
public class MainController {

	@Autowired
	LibraryService libService;	
	
	@RequestMapping("/processHome")
	public String processHome(Model model) {
	
	List<Book> books = libService.getAllBooks();	
    List<Author> authorsName = new ArrayList<Author>();
	
	for(Book temp: books) {
		System.out.println(temp.getAuthor().getAuthorName());
		authorsName.add(temp.getAuthor());
	}
	
	model.addAttribute("books",books);

	model.addAttribute("authorsName", authorsName);
		
		return "home";
	}
	
	@RequestMapping("/newBook")
	public String showForm(Model model) {
		
		model.addAttribute("book", new Book());
		
		List<Author> authors = libService.getAllAuthor();
		
		model.addAttribute("authors", authors);
		
		return "form";
		
	}
	
	@RequestMapping("/processForm")
	public String showForm(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "form";
		}
		
		System.out.println(book);
		
		book.setAuthor(libService.getAuthorById(book.getAid()));
		
		libService.saveBook(book);
		
		return "redirect:/library/processHome";
	}
	
}
