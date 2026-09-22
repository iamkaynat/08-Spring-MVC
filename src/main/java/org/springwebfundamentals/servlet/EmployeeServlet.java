package org.springwebfundamentals.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/employee/*")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



            // 1. Set the response content type
            response.setContentType("text/html");
            // 2. Write a message back to the browser screen
            PrintWriter out = response.getWriter();

            String uri = request.getRequestURI();
            if(uri.endsWith("/details")){
                out.println("<h1>Employee details</h1>");

            }
            else{
                out.println("<h1>Success! Employee Servlet is working perfectly.</h1>");
                out.println("<h2>HTTP METHOD: "+request.getMethod()+"</h2>");
                out.println("<h2>Request URI: "+request.getRequestURI()+"</h2>");
                out.println("<h2>Server Name: "+request.getServerName()+"</h2>");
                out.println("<h2>Server Port: "+request.getServerPort()+"</h2>");
            }

    }


}
