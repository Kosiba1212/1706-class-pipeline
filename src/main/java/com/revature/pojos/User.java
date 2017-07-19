package com.revature.pojos;

import java.io.Serializable;

//POJO, Bean, Model are all similar names
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7432702573588742955L;
	
	//State
	private int userID;
	private String username;
	private String password;
	
	
	//No-Args
	public User(){}
	
	//Args
	public User(int userID, String username, String password) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
	}

	
	//Getters and setters
	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	//ToString
	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
}
