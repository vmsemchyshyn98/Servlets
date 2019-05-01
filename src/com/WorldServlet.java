package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class WorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*PrintWriter writer = resp.getWriter();

        writer.print("<h1>Hello, Vova</h1>");*/

        HttpSession session = req.getSession();

        System.out.println(session.getAttribute("message"));
    }
}
