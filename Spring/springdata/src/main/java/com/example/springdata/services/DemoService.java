package com.example.springdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdata.entity.Topic;
import com.example.springdata.repository.DemoRepository;

@Service
public class DemoService {
	
	@Autowired
	DemoRepository demoRepository;
	
//	List<Topic> topicList = new ArrayList<>(Arrays.asList(
//			new Topic("1","java","basic course of" ),
//			new Topic("400", "python","detail course structure")
//			));
	// public String  getName() {
	// 	return "hello";
	// }
	
	public List<Topic> getTopics(){
		

		List<Topic> topicList = new ArrayList<>();
		demoRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	
	public   Topic  getTopicData(String id ) {

		return demoRepository.findById(id).get();
	}

	public void  addTopic(Topic topic) {

		demoRepository.save(topic);
	}

	public void updateTopic(Topic topic ) {
		demoRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
	    demoRepository.deleteById(id);
		
	}
	
	
}