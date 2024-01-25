package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {
	
	StudentRepository ref;
	
	
	@Autowired
	public StudentContoller(StudentRepository ref) {
		// TODO Auto-generated constructor stub
		this.ref=ref;
	}
	
	
	@GetMapping("/insert")
	public String storeStudent() {
		Student s1=new Student("Varunkumar Kuruba",90,"Varun@1729");
		ref.save(s1);
		return "student stored in DB";
	}

}
