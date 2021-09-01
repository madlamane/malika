package employeedao;

import java.util.List;
import java.sql.*;
import employeedto.Employee;
import connectionpkg.ConnectionData;;
public class EmployeeDAO implements EmployeeInter {
	private Connection con;
	private PreparedStatement stat;
	
	public EmployeeDAO()
	{
		con=ConnectionData.getDataConnection();
		System.out.println("Connection establishd");
	}
	@Override
	public void insert(Employee emp){
		// TODO Auto-generated method stub
		try
		{
		stat=con.prepareStatement("insert into employee values(?,?,?)");
		stat.setInt(1, emp.getEmpid());
		stat.setString(2, emp.getName());
		stat.setDouble(3, emp.getSalary());
		int x=stat.executeUpdate();
		if(x>0)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("not inserted");
		}
		
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
	}

	@Override
	public void delete(int empid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmp(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

}