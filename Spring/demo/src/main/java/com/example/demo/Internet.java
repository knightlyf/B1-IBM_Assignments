package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Internet {
    private String ipAdd;
    private int speed;

    public String getIpAdd() {
        return ipAdd;
    }
    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void switchOn() {
        System.out.println("Internet is on");
    }
}
