package com.prabhat.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prabhat.model.User;

/**
 * @author Dinesh Rajput
 *
 */
@Repository("userDao")  
public class UserDaoImpl implements UserDao {

	@Autowired  
	private SessionFactory sessionFactory;  
	
	@Override
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() {
		return (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

}
