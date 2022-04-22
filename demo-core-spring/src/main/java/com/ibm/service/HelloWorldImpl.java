package com.ibm.service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String printHelloWorld(String msg) {

		System.out.println("Hello : " + msg);
		
		return "Hello" + msg;
	}

}