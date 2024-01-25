package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	EmployeeRepository ref;
	
	
	@Autowired
	public EmployeeController(EmployeeRepository ref) {
		// TODO Auto-generated constructor stub
		this.ref=ref;
	}
	
	@PostMapping("/saveemployee")
	public Employee saveEmployee(@RequestBody Employee e) {
		
		return ref.save(e);
	}
}
