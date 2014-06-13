package com.prabhat.dao;

import java.util.List;

import com.prabhat.model.User;

/**
 * @author Dinesh Rajput
 *
 */
public interface UserDao {
	void saveUser(User user);
	
	List<User> getUserList(); 
}
