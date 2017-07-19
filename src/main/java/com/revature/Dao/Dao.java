package com.revature.Dao;

import com.revature.pojos.User;

public interface Dao {
	
	/*
	 * CRUD Operations Only!
	 * 
	 * 
	 */
	
	//Read
	public User getUserByUsername(User user);

}
