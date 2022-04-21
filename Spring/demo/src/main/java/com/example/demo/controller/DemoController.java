package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/helloPage")
    public String getName() {
        return "Hello World";
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
    
}
