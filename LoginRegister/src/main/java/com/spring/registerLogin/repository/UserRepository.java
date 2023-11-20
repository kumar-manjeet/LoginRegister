package com.spring.registerLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.registerLogin.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
