package com.example.springdata.controller;

import java.util.List;

import com.example.springdata.entity.Topic;
import com.example.springdata.services.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @Autowired
    public DemoService demoService;

    @RequestMapping("/topics")
	public   List<Topic> getTopic() {
		//		return Arrays.asList("good morning", "hello", "good even");
		return demoService.getTopics();
	}


	@RequestMapping("/topics/{id}")
	public    Topic   getTopicData(@PathVariable String id ) {
		return demoService.getTopicData(id);
	}


	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public   void  addTopic(@RequestBody Topic topic) {
		demoService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public   void  updateTopic(@RequestBody Topic topic, @PathVariable String id ) {
		System.out.println("*************1***********");
		demoService.updateTopic(topic);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public   void  updateTopic( @PathVariable String id   ) {
		demoService.deleteTopic( id);
	}
}
