package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.BranchesDAO;
import com.Dao.UserDAO;
import com.entity.Branches;
import com.entity.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;

		String s1 = request.getParameter("h1");

		try {
			if (s1.equals("Login")) {
				String username = request.getParameter("username");
				String pwd = request.getParameter("password");

				UserDAO userdao = new UserDAO();

				User user = userdao.getUserByEmailAndPwd(username, pwd);
				if (user.getUserid() > 0) {
					requestDispatcher = request.getRequestDispatcher("Branches.jsp");
				}
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				requestDispatcher.forward(request, response);
			}
			else if (s1.equals("branches")) {
				BranchesDAO branchesdao = new BranchesDAO();
				List<Branches> allbranches = branchesdao.getAllBranches();

				// requestDispatcher = request.getRequestDispatcher("items.jsp");
				// HttpSession session = request.getSession();
				request.setAttribute("allbranches", allbranches);
				// requestDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}

}
