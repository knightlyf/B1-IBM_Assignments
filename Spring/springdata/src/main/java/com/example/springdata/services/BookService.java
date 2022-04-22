package com.example.springdata.services;

import java.util.ArrayList;
import java.util.List;

import com.example.springdata.entity.Book;
import com.example.springdata.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    
    public List<Book> getAllBooks(String id){
        List<Book> booklist = new ArrayList<>();
        bookRepository.findByTopicId(id).forEach(booklist::add);
        return booklist;
    }
    
    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void updateBook(Book book){
        bookRepository.save(book);
    }
    public void deleteBook(String id){
        bookRepository.deleteById(id);
    }

    public Book getBooks(String id){
        return bookRepository.findById(id).get();
    }
}
