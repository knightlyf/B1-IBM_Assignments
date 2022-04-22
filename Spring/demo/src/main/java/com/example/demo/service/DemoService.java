package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Topic;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {

	DemoRepository demoRepository;
	// List<Topic> topicList = new ArrayList<>(Arrays.asList(
	// 	new Topic("1","Alpha","ABC"),
	// 	new Topic("2","Bravo","BCD")
	// 	));
	public String getName() {
		return "hello";
	}
	
	public List<Topic> getTopics(){
		List<Topic> topicList = new ArrayList<>();
		demoRepository.findAll().forEach(topicList :: add);
		return topicList;
	}
	
	public Topic getTopicData(String id) {
		return demoRepository.findById(id).get();
		// return topicList.stream().filter(x->x.getId().equals(id)).findFirst().get();

	}
	
	public void addTopic(Topic topic) {
		// topicList.add(topic);
		demoRepository.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		demoRepository.save(topic);
	// 	for(int i=0;i<topicList.size();i++) {
	// 		Topic t = topicList.get(i);
	// 		if(t.getId().equals(id)) {
	// 			topicList.set(i, t);
	// 		}
	// 	}
	}
	
	public void deleteTopic(String id) {
		// topicList.removeIf(x->x.getId().equals(id));
		demoRepository.deleteById(id);
	}


}
// <!-- <plugin>
// 				<groupId>org.apache.maven.plugins</groupId>
// 				<artifactId>maven-compiler-plugin</artifactId>
// 				<version>3.8.1</version>
// 				<configuration>
// 					<source>1.7</source>
// 					<target>1.7</target>
// 				</configuration>
// 			</plugin> -->
