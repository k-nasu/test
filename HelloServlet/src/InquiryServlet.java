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
@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	
    public InquiryServlet() {
<<<<<<< HEAD
    	super();
        
=======
        super();
>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
<<<<<<< HEAD
		String name= request.getParameter("name");
		
		
	System.out.println(name);
	
	PrintWriter out=response.getWriter();
	out.println("<html><head></head><body><br>"+name+"さん、お問い合わせありがとうございました</body></html>");
	
=======
		String name =request.getParameter("name");
		
		System.out.println(name);

	PrintWriter out=response.getWriter();
	out.println("<html><head></head><body><br>"+name+"さん、お問い合わせ有難うございました</body></html>");
>>>>>>> 6acb13b7841f4847b066da2ef180e5b2569813ce
	}

}
