package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jiangqw
 * @date 2019/8/30 9:51
 */
public class ListenerTester extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test context attributes set by listener<br>");
        out.println("<br>");
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        out.println("dog's breed is: " + dog.getBreed());
    }
}
