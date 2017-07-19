package com.revature.Dao;

import com.revature.pojos.User;

public class DaoImpli implements Dao {

	public User getUserByUsername(User user) {
		User dbUser = null;
		/*
		 * preparedStatment using a Select * FROM Users WHERE username = user.getUsername();
		 * 
		 * 
		 */
		
			dbUser = new User(1, "steve", "123");
		return dbUser;
	}

}
