package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/crud")
public class EmployeeController {

	EmployeeService regf;

	@Autowired
	public EmployeeController(EmployeeService ref) {
		// TODO Auto-generated constructor stub
		this.regf = ref;
	}

	@GetMapping("/employees")
	public String listEmployee(Model theModel)
	{
		theModel.addAttribute("list", regf.findAll());
		return "empdirectory";
	}
	
	@GetMapping("/showFormForAdd")
	public String addEmployee(Model theModel) {
		Employee e=new Employee();
		theModel.addAttribute("employee", e);
		return "empform";
	}
	
	@GetMapping("/showformtoupdate")
	public String showFormForUpdate(@RequestParam("employeeid") int id, Model theModel) {
	    Employee emp = regf.findById(id);
	    theModel.addAttribute("employee", emp);
	    return "empform";
	}


	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("employee") Employee e) {
		regf.saveEmp(e);
		return "redirect:/crud/employees";
	}
	@GetMapping("/delete") 
	public String delete(@RequestParam("employeeid") int id) 
	{ 
	regf.deleteEmp(id); 
	return "redirect:/crud/employees"; 
	} 
}
