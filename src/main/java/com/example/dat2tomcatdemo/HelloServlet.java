package com.example.dat2tomcatdemo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("navn");
        request.setAttribute("navn", name);
        request.getSession().setAttribute("navn", name);
        request.getRequestDispatcher("WEB-INF/minside.jsp").forward(request, response);
    }
}