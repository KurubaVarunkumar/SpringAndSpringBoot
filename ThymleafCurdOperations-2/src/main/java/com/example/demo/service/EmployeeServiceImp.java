package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repositoty.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	EmployeeRepository ref;
	
	
	@Autowired
	public EmployeeServiceImp(EmployeeRepository ref) {
		super();
		this.ref = ref;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return ref.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> op=ref.findById(id);
		return op.get();
	}

	@Override
	public void saveEmp(Employee e) {
		// TODO Auto-generated method stub
		ref.save(e);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		ref.deleteById(id);
	}

}
