package com.sapient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
//			response.getWriter().append("<h1>Hello World!</h1><h2>Welcome to Servlet!</h2><br>You are @ : ").append(request.getContextPath() + request.getServletPath());
			response.getWriter().print("<center><form action='FirstServlet' method=POST>");
			response.getWriter().print("<h1>Addition of Two Numbers</h1>");
			response.getWriter().print("<br>Enter First Number <input type='number' name='a' value='0'>");
			response.getWriter().print("<br>Enter Second Number <input type='number' name='b' value='0'>");
			response.getWriter().print("<br>Result <input type='number' name='c' value='0' disabled>");
			response.getWriter().print("<br><input type='submit' value='Add' />");
			response.getWriter().print("</form>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int a = Integer.parseInt(request.getParameter("a"));
			int b = Integer.parseInt(request.getParameter("b"));
			int c = a + b;
//			response.getWriter().append("<h1>Hello World!</h1><h2>Welcome to Servlet!</h2><br>You are @ : ").append(request.getContextPath() + request.getServletPath());
			response.getWriter().print("<center><form action='FirstServlet' method=POST>");
			response.getWriter().print("<h1>Addition of Two Numbers</h1>");
			response.getWriter().print("<br>Enter First Number <input type='number' name='a' value='" + a + "'>");
			response.getWriter().print("<br>Enter Second Number <input type='number' name='b' value='" + b + "'>");
			response.getWriter().print("<br>Result <input type='number' name='c' value='" + c + "' disabled>");
			response.getWriter().print("<br><input type='submit' value='Add' />");
			response.getWriter().print("</form>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
