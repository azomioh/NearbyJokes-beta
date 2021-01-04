package com.maroua.NBJokes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	
	protected void doPost(HttpServletRequest Req, HttpServletResponse Res) throws ServletException, IOException {
		HttpSession session = Req.getSession();
		Req.getRequestDispatcher("/login.jsp").forward(Req,Res);
    	session.removeAttribute("email");
    	session.setAttribute("message", "You were logged out successfully");


	}

}