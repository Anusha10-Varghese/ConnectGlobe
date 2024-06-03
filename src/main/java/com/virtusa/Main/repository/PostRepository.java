package com.virtusa.Main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.virtusa.Main.model.Post;



public interface PostRepository extends JpaRepository<Post, Long>{
	

	@Query("SELECT p FROM Post p WHERE p.username= ?1")
	
	Post findByUsername(String username);
	

}
