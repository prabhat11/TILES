package com.prabhat.service;

import java.util.List;

import com.prabhat.model.User;

/**
 * @author Dinesh Rajput
 *
 */
public interface UserService {
	void saveUser(User user);
	
	List<User> getUserList(); 
}
