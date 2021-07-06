import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        try {
            printWriter.print("<center><form action = 'FirstServlet' method = 'post' >");
            printWriter.print("<br> <h1> Addition of two numbers <h1> ");
            printWriter.print("<br> Enter first number <input type= 'text' name='a1' value='0' >");
            printWriter.print("<br> Enter second number <input type= 'text' name='a2' value='0' >");
            printWriter.print("<br> Result <input type= 'text' name='a3' value='0' >");
            printWriter.print("<br> <input type= 'submit' value='add' >");

            printWriter.print("</form>");

        } catch (Exception e) {

        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        try {
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

        } catch (Exception e) {

        }
    }
}
