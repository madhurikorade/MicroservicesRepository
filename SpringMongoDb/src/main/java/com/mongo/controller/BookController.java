package com.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.entity.Book;
import com.mongo.repository.BookRepository;
import com.sun.tools.javac.main.Option;

@RestController
public class BookController
{
	@Autowired
    private BookRepository repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book)
	{
		repository.save(book);
		return "added book with id:"+book.getId();
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks()
	{
		return repository.findAll();
	}
	
    @GetMapping("/findBookByid/{id}")
	public Optional<Book> getBook(@PathVariable Integer id)
	{
		return repository.findById(id);
	}
    
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id)
    {
    	repository.deleteById(id);
    	return "book deleted successfully"+id;
    }
	
}
