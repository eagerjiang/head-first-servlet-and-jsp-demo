import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author jiangqw
 * @date 2019/8/25 15:53
 */
public class CodeReturn extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/jar");
        ServletContext servletContext = getServletContext();
        InputStream inputStream = servletContext.getResourceAsStream("/bookCode.jar");
        int read = 0;
        byte[] bytes = new byte[1024];
        OutputStream outputStream = response.getOutputStream();
        while ((read = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes,0,read);
        }
        outputStream.flush();
        outputStream.close();
    }
}
