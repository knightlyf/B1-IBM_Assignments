package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Topic;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	public DemoService demoService;
	
    @RequestMapping("/helloPage")
    public String getName() {
        return demoService.getName();
    }

    // @RequestMapping("/error")
    // public String getError() {
    //     return "Error";
    // }
    @RequestMapping("/list")
    public List<String> getlist(){
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        return list;
    }
    
    @RequestMapping("/topics")
    public List<Topic>getTopic(){
    	return demoService.getTopics();
    }
    
    @RequestMapping("/topics/{id}")
    public Topic getTopicData(@PathVariable String id) {
    	return demoService.getTopicData(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic) {
    	demoService.addTopic(topic);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
    	demoService.updateTopic(topic,id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
    	demoService.deleteTopic(id);
    }
    
    
}
