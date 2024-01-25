package com.example.demo.service;

import java.util.List;



import com.example.demo.entity.Employee;


public interface EmployeeService {

	public List<Employee> findAll();
	public Employee findById(int id);
	public void saveEmp(Employee e);
	public void deleteEmp(int id);
}
