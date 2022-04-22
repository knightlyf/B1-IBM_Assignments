package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.Entity.Food;

import org.springframework.stereotype.Service;

@Service
public class DemoService1 {
    List<Food> foodList = new ArrayList<>(Arrays.asList(
            new Food("1","Burger","ABC"),
            new Food("2","Fries","BCD"),
            new Food("3","Pizza","CDE")
            ));
    public String getName() {
        return "FOOD";
    }
    public List<Food> getFoods(){
        return foodList;
    }
    public Food getFoodData(String id) {
        return foodList.stream().filter(x->x.getId().equals(id)).findFirst().get();
    }
    public void addFood(Food food) {
        foodList.add(food);
    }
    public void updateFood(Food food, String id) {
        for(int i=0;i<foodList.size();i++) {
            Food f = foodList.get(i);
            if(f.getId().equals(id)) {
                foodList.set(i, f);
            }
        }
    }
    public void deleteFood(String id) {
        foodList.removeIf(x->x.getId().equals(id));
    }
}
