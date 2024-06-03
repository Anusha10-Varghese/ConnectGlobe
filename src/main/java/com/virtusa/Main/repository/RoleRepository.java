package com.virtusa.Main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.virtusa.Main.model.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);
}
