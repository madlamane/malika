package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
PrintWriter out;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
