package com.pro.wings.service;

import org.springframework.stereotype.Service;

import com.pro.wings.dao.EmployeeDao;
import com.pro.wings.entity.Employee;

public interface EmployeeService {
	
	public boolean addEmployee(Employee emp);

}
