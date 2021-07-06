

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.print("<centre><form >");
		pw.print("Enter First Number<input type='text' name = 'f1 value='0'>");
		pw.print("<br>Enter 2nd number Number<input type='text' name = 'f2 value='0'>");
		pw.print("<br>Added Number<input type='text' name = 'f3 value='0'>");
		pw.print("<br><input type='submit' name = 'f4 value='add'>");
		pw.print("<centre></form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.print("<centre><form >");
		
		
		
		pw.print("Enter First Number<input type='text' name = 'f1 value='0'>");
		pw.print("<br>Enter 2nd number Number<input type='text' name = 'f2 value='0'>");
		pw.print("<br>Added Number<input type='text' name = 'f3 value='0'>");
		pw.print("<br><input type='button' name = 'f4 value='add'>");
		pw.print("<centre></form>");
	}

}
