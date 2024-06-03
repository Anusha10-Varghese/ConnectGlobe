package com.virtusa.Main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.virtusa.Main.model.Post;
import com.virtusa.Main.model.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer>{

	@Query("SELECT t FROM Topic t WHERE t.id= ?1")
	Post findById(String id);


}
