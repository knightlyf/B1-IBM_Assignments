package com.example.springdata.repository;

import java.util.List;

import com.example.springdata.entity.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,String>{

	public List<Book> findByTopicId(String id);
	
}