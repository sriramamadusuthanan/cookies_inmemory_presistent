

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String pass= request.getParameter("password");
		//seting max age to it ie time limit for the storage make it a presisit cookie , by defaut its -1 
		//so the cookie gets cleared when the browser is closed 
		//SetMaxAge(time) give a time duration ,how long the cookie should be saved
		if(name.equals("sriram") && pass.equals("123"))
		{
			Cookie ck = new Cookie("usernamec1", name);
			ck.setMaxAge(6000);
			response.addCookie(ck);
			response.sendRedirect("WelcomePg");
		}else
		{
			//redirect to error pg
			response.sendRedirect("login.html");
		}
		
	}



}
