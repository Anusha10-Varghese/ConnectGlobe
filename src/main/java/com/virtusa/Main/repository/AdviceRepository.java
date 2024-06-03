package com.virtusa.Main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.virtusa.Main.model.*;



public interface AdviceRepository extends JpaRepository<Advice,Integer> {

	@Query("SELECT a FROM Advice a WHERE a.id= ?1")
	Post findById(String id);

}
