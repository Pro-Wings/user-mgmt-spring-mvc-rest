package com.pro.wings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pro.wings.entity.Employee;
import com.pro.wings.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@PostMapping("/employee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp) {
		boolean empSaved = empService.addEmployee(emp);
		if (empSaved)
			return ResponseEntity.ok("Employee record saved successfully!!");
		else
			return ResponseEntity.ok("Employee record not saved!!");
	}

}
