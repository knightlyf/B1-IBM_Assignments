package com.example.springdata.repository;

import com.example.springdata.entity.Topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DemoRepository extends CrudRepository<Topic,String>{

}