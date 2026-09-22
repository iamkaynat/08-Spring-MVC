package org.springwebfundamentals.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/employees/*")
public class EmployeeSearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        String id = request.getParameter("id");
        String department = request.getParameter("department");
        out.println("ID: " + id);
        out.println("Department: " + department);
    }
}
