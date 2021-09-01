package myservlet;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/First")//url pattern by which my servlet will be access
//from browser
public class FirstServlet extends HttpServlet
{
	PrintWriter out;//PRintWriter class which to print anything on screen
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		out=res.getWriter();//Retreiving printwriter referene for response
		out.println("<font color=red size=6>Welcome to Servlets</font>");
	}
	
}