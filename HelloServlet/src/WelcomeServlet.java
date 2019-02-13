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

=======
>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	
    public WelcomeServlet() {
        super();
        
    }

<<<<<<< HEAD
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String username =request.getParameter("username");
=======

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String username = request.getParameter("username");
>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
		
		System.out.println(username);
		
		PrintWriter out=response.getWriter();
		out.println("<html><head></head><body><br>"+username+"さん、ようこそ！</body></html>");
		
<<<<<<< HEAD
	
=======
>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
	}

}
