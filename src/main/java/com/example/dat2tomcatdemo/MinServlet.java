package com.example.dat2tomcatdemo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "minServlet", value = "/min-servlet")
public class MinServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String tal = request.getParameter("tal");
        request.setAttribute("tal", tal);
        request.getRequestDispatcher("WEB-INF/duimaal.jsp").forward(request, response);
    }
}