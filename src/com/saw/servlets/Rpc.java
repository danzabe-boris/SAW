package com.saw.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Rpc extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse
			response ) throws ServletException, IOException {
			this.getServletContext().getRequestDispatcher( "/AccueilRC.html"
			).forward( request, response );
}
}
