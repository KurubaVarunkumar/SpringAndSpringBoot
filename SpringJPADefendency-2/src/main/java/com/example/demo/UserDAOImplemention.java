package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@Repository
public class UserDAOImplemention implements UserDAO {
	
	EntityManager ref;
	
	
	@Autowired
	public UserDAOImplemention(EntityManager ref) {
		super();
		this.ref=ref;
	}



	@Override
	@Transactional
	public void save(User e) {
		// TODO Auto-generated method stub
		ref.persist(e);
	}

}
