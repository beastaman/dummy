
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();

        response.setContentType("text/html");

        printWriter.print("<center><form action = 'FirstServlet' method = 'post' >");
        printWriter.print("<br> <h1> Addition of two numbers <h1> ");
        printWriter.print("<br> Enter first number <input type= 'text' name='a1' value='0' >");
        printWriter.print("<br> Enter second number <input type= 'text' name='a2' value='0' >");
        printWriter.print("<br> Result <input type= 'text' name='a3' value='0' >");
        printWriter.print("<br> <input type= 'submit' value='add' >");
        printWriter.print("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html");

        int a = Integer.parseInt(request.getParameter("a1"));
        int b = Integer.parseInt(request.getParameter("a2"));
        int c = a + b;

        printWriter.print("<center><form action = 'FirstServlet' method = 'post' >");
        printWriter.print("<br> <h1> Addition of two numbers <h1> ");
        printWriter.print("<br> Enter first number <input type= 'text' name='a1' value= '" + a + "' >");
        printWriter.print("<br> Enter second number <input type= 'text' name='a2' value= '" + b + "' >");
        printWriter.print("<br> Result <input type= 'text' name='a3' value= '" + c + "' >");
        printWriter.print("<br> <input type= 'submit' value='add' >");

        printWriter.print("</form>");

    }

}
