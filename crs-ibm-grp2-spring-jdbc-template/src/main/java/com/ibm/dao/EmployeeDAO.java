package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Employee;

public interface EmployeeDAO {
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   
	   public Employee create(Employee employee);
	   
	   public Employee getEmployee(Integer id);
	  
	   public List<Employee> listEmployees();
	  
	   public void delete(Integer id);
	  
	   public Employee update(Employee employee);


}
