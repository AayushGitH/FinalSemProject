package com.pro.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.api.dao.UserRepository;
import com.pro.api.entities.User;
import com.pro.api.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepository;

	// Create
	@Override
	public User addUser(User user) 
	{
		return this.userRepository.save(user);
	}

	// Read
	@Override
	public User readUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> readUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User readUserByName(String username) 
	{
		return this.userRepository.findByName(username);
	}

	// Update
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	// Delete
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	

}
