package myvalid;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValid
 */
@WebServlet("/LoginValid")
public class LoginValid extends HttpServlet {
	PrintWriter out;
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws 
	ServletException,IOException
	{
			out=res.getWriter();
			String log=req.getParameter("loginid");
			String pass=req.getParameter("password");
			if(log.equals("admin")&&pass.equals("admin"))
			{
				out.println("Valid login details");
			}
			else
			{
				out.println("invalid details");
			}
		
	}
}
