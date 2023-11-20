package com.spring.registerLogin.service;

import java.util.List;

import com.spring.registerLogin.dto.UserDto;
import com.spring.registerLogin.entity.User;

public interface UserService {
	
	void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
