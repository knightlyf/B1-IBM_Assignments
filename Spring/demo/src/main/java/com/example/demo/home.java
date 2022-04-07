package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class home {
    @Autowired
    Internet ic;
    private String owner;
    private int doorNo;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
    public home() {
        super();
        System.out.println("home constructor");
    }
    public void connect(){
        Internet ic = new Internet();
        ic.switchOn();
        System.out.println("Connection");
    }
}
