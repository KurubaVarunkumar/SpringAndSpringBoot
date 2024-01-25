package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	UserDAO ref;
	
	
	@Autowired
	public UserController(UserDAO ref) {
		// TODO Auto-generated constructor stub
		this.ref=ref;
	}
	
	@PostMapping("/saveuser")
	public  String persisuser( @RequestBody User u) {
		ref.save(u);
		return "sucess";
	}
}
