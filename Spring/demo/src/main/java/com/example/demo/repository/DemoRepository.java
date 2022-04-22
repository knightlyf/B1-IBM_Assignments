package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Entity.Topic;

@Repository
public interface DemoRepository extends CrudRepository<Topic,String>{

}
    
