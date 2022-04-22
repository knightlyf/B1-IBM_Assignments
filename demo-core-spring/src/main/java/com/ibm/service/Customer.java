package com.ibm.service;

import com.ibm.bean.CustomerBean;

public interface Customer {
    //directly pass object rather than parameters
    public void createCustomer(int id, String name, String address, int pin, String dob);
//    public void createCustomer(CustomerBean customer);
    public void updateCustomer(int id, String name, String address, int pin, String dob);
    public void deleteCustomer(int id);
    public void listCustomer();
}
// 1. createCustomer()
// 2. updateCustomer()
// 3. listCustomer()
// 4. deleteCustomer()