package maven_test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 

@WebServlet("/helloworld")
@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {
	/* log4j2
	//private static final Logger logger = LogManager.getLogger(HelloWorldServlet.class.getName());
	 */
	private static final Logger logger = LogManager.getLogger(); 
	

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		logger.info("Exiting the program Info");
		logger.debug("Exiting the program Debug");

		try {
			out.println("<!DOCTYPE html>");
			out.println("<html><head></head><body>");
			out.println("<h1>Hello, World!</h1>");
			out.println("<h1>Servlet!</h1>");
			out.println("</body></html>");
		} finally {
			out.close();
		}
	}
}