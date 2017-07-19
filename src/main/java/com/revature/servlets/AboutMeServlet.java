package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aboutMe")
public class AboutMeServlet extends HttpServlet {
		/*
		 * URL for AboutMe
		 * 		/aboutMe
		 * 
		 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("AboutMeServlet- GET");
		req.getRequestDispatcher("aboutMe.jsp").forward(req, resp);	//Chaining forward, just shorthand
	}

}
