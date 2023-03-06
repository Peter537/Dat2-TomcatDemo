package com.example.dat2tomcatdemo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;

    @Override
    public void init() {
        this.message = "Hej";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String name = request.getParameter("navn");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + this.message + " " + name + "</h1>");
        out.println("</body></html>");

        request.setAttribute("navn", name);
        request.getRequestDispatcher("WEB-INF/indenfor.jsp").forward(request, response);
    }

    @Override
    public void destroy() { }
}