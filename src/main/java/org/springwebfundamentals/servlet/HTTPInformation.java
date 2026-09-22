package org.springwebfundamentals.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/http-info/*")
public class HTTPInformation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws SecurityException , IOException{
        String URI = request.getRequestURI();
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
       if(URI.endsWith("/headers")){
           out.println("<h2>Header Information</h2>");
           out.println("Host: " + request.getHeader("Host"));
           out.println("User-Agent" + request.getHeader("User-Agent"));
           out.println("Accept: " + request.getHeader("Accept"));
           out.println("Content-Type" + request.getHeader("Content-Type"));
           out.println("Connection: " + request.getHeader("Connection"));
       }else{
           out.println("<h2>HTTP Information-----------</h2>");
           out.println("METHOD : " + request.getMethod());
           out.println("URI : " + URI);
           out.println("Protocol: " + request.getProtocol());
           out.println("Server: " + request.getServerName());
           out.println("Port: " + request.getLocalPort());
           out.println("Content Type: " + request.getContentType());
       }



    }
}
