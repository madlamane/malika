package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
PrintWriter out;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		out=res.getWriter();
		int result =0;
		try {
		String Num1=req.getParameter("Num1");
		String Num2=req.getParameter("Num2");
		String Operator=req.getParameter("Operator");
		int x = Integer.parseInt(Num1);
		int y = Integer.parseInt(Num2);
		if(Operator.equals("+")) {
			 result =  x+ y;
			//out.println("The Result is :"+ result);
		}
		if(Operator.equals("-"))
		{
			result = x-y;
			//out.println("The Result is :"+ result);
		
		}
		if(Operator.equals("*"))
		{
			result = x*y;
			//out.println("The Result is :"+ result);
		
		}
		if(Operator.equals("/"))
		{
			result = x/y;
			//out.println("The Result is :"+ result);
		
		}
		out.println("The Result is :"+ result);
		
		}
		catch (Exception e) {}
		
		
		
		
	}
}
