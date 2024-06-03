package com.virtusa.Main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.virtusa.Main.model.Post;
import com.virtusa.Main.model.Report;

public interface ReportRepository extends JpaRepository<Report, Integer>{
	
	@Query("SELECT r FROM Report r WHERE r.id= ?1")
	Post findById(String id);



}
