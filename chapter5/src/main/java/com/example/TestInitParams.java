package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author jiangqw
 * @date 2019/8/27 14:33
 */
public class TestInitParams extends HttpServlet  {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test init parameters<br>");
        Enumeration<String> enumeration = getServletConfig().getInitParameterNames();
        while (enumeration.hasMoreElements()) {
            out.println("<br>param name = " + enumeration.nextElement() + "<br>");
        }
        out.println("main email is " + getServletConfig().getInitParameter("mainEmail"));
        out.println("<br>");
        out.println("admin email is "+getServletConfig().getInitParameter("adminEmail"));
    }
}
