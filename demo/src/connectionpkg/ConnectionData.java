package connectionpkg;

import java.sql.*;
public class ConnectionData {
	private static Connection  con;
	private ConnectionData()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","1983barada");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("unable to load driver");
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	public  static Connection getDataConnection()
	{
		ConnectionData c1=new ConnectionData();
	return con;
	}

}