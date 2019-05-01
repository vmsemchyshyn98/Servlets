package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Hello world");

 /*       String name = req.getParameter("name");
        String age = req.getParameter("age");

        PrintWriter writer = resp.getWriter();

        writer.print("<h1>" + name + "\t" + age + "</h1>");*/
//        resp.sendRedirect("http://jenkov.com");
        resp.sendRedirect("html/FormHello.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.print("<h1>Login</h1>");
    }
}
