<<<<<<< HEAD
=======

>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
    public HelloServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out =response.getWriter();
	out.println("<HTML>");
	out.println("<BODY>");
	out.println("<H3>Hello Servlet!</H3>");
	out.println("</BODY>");
	out.println("</HTML>");
	
=======
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	
	public HelloServlet(){
		super();
	}
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H3>Hello Servlet!</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		
>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
	}

}
