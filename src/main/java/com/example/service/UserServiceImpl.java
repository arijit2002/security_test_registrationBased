package com.example.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.model.Role;
import com.example.repository.UserRepository;
import com.example.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user =new User(registrationDto.getFirstName(),registrationDto.getLastName(),
				registrationDto.getPassword(),Arrays.asList(new Role("ROLE_USER")));
	}
}
