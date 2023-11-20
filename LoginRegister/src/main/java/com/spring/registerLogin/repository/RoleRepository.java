package com.spring.registerLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.registerLogin.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByName(String name);

}
