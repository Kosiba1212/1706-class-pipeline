package com.revature.service;

import com.revature.Dao.Dao;
import com.revature.Dao.DaoImpli;
import com.revature.pojos.User;

public class Service {
	
	public User authenticateUser(User user){
		//This method will validate a user's username and password
		
		/*
		 * How can I authenticate the user?
		 * 	-The Service will user Dao methods to complete the task!
		 * 
		 * 
		 */
		Dao dao = new DaoImpli();
		User dbUser = dao.getUserByUsername(user);
		
		if(dbUser.getUsername().equals(user.getUsername()) && 
				dbUser.getPassword().equals(user.getPassword())){
			return dbUser;
			
		}
		
		return null;

	}

}
