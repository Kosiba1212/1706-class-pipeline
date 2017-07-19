package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pojos.User;
import com.revature.service.Service;

public class LoginServlet extends HttpServlet {
		/*
		 * Url for LoginServlet
		 * 	login
		 * 
		 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		System.out.println("Login Servlet- GET");
		resp.sendRedirect("index.html");
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("LoginServlet -POST");
			
			User clientUser = new User();
			
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			clientUser.setUsername(username);
			clientUser.setPassword(password);
			
			clientUser = new Service().authenticateUser(clientUser);	//Either recieve a valid user or null
			
			System.out.println("The user entered: " + username + "&" + password);
			if(clientUser != null){
				HttpSession session = req.getSession();	//j_session_id stored in a cookie on the client's browser
				
				session.setAttribute("user", clientUser); //The parameters: name, and the actual object that you want to store in the session
				
			//resp.getWriter().write("<h1> Welcome to Revature " + username +  "</h1>");
			req.getRequestDispatcher("home.jsp").forward(req, resp);
				
			}else{
				resp.sendRedirect("index.html");
			}
	}
}
