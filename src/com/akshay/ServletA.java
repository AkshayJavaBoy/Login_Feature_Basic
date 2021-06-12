package com.akshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
		String st = request.getParameter("username");
		String str = request.getParameter("password");
		PrintWriter out = response.getWriter();
		Dao da = new Dao();

		if (da.check(st, str)) {
			out.println("<html><body>Login Successfull</body></html>");
		} else
			out.println("<html><body>Failure</body></html>");
	}

}
