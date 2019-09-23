package session.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jiangqw
 * @date 2019/9/12 10:59
 */
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test session attributes<br>");
        HttpSession session = request.getSession();
        if (session.isNew()) {
            out.println("this is a new session");
        }else {
            out.println("welcome back");
        }
    }
}
