package com.example.springdata.controller;

import com.example.springdata.entity.Book;
import com.example.springdata.entity.Topic;
import com.example.springdata.services.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
    
    @Autowired
    BookService bookService;

    @RequestMapping("/topics/{id}/books")
    public List<Book> getAllBooks(@PathVariable String id) {
        return bookService.getAllBooks(id);
    }

    @RequestMapping("/topics/{id}/books/{bookId}")
    public Book getBook(@PathVariable String bookId){
        return bookService.getBooks(bookId);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics/{id}/books")
    public void addBook(@RequestBody Book book, @PathVariable String id){
        book.setTopic(new Topic(id,"",""));
        bookService.addBook(book);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}/books/{bookId}")
    public void updateBook(@RequestBody Book book, @PathVariable String id, @PathVariable String bookId){
        book.setTopic(new Topic(id,"",""));
        bookService.updateBook(book);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}/books/{bookId}")
    public void deleteBook(@PathVariable String bookId){
        bookService.deleteBook(bookId);
    }
}
