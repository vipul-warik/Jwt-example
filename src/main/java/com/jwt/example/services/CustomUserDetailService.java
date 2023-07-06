package com.jwt.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.example.entities.User;
import com.jwt.example.repositories.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
		
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		User user = userRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("User not found !!"));
		//load user form database
		
		return user;
	}
	
}
