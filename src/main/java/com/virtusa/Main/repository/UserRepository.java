package com.virtusa.Main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.Main.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
	
}