package calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/calculator")
public class Calculator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        int number1 = Integer.parseInt(req.getParameter("firstNumber"));
        int number2 = Integer.parseInt(req.getParameter("secondNumber"));
        String operation = req.getParameter("operation");
        int result = 0;

        if (operation.equals("+")) {
            result = number1 + number2;
        }

        if (operation.equals("-")) {
            result = number1 + number2;
        }

        if (operation.equals("*")) {
            result = number1 * number2;
        }
        if (operation.equals("/")) {
            result = number1 / number2;
        }

        writer.print("<p>" + number1 + operation + number2 + " = " + result + "</p");
    }


}
