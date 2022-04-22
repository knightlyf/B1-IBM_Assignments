package com.example.demo.controller;

import java.util.List;

import com.example.demo.Entity.Food;
import com.example.demo.service.DemoService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {

    @Autowired
    public DemoService1 demoService1;
    
    @RequestMapping("/Food")
    public List<Food> getFood(){
        return demoService1.getFoods();
    }

    @RequestMapping("/Food/{id}")
    public Food getFoodData(@PathVariable String id){
        return demoService1.getFoodData(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Food")
    public void addFood(@RequestBody Food food){
        demoService1.addFood(food);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/Food/{id}")
    public void updateFood(@RequestBody Food food, @PathVariable String id){
        demoService1.updateFood(food,id);
    }

    @RequestMapping(method = RequestMethod.DELETE , value="/Food/{id}")
    public void deleteFood(@PathVariable String id){
        demoService1.deleteFood(id);
    }
}
