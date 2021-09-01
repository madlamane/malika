package client;

import employeedao.EmployeeDAO;
import employeedto.Employee;

public class Main {
public static void main(String args[])
{	EmployeeDAO edao;

	edao=new EmployeeDAO();
	Employee e1=new Employee();
	e1.setEmpid(1);
	e1.setName("Namita");
	e1.setSalary(88888.99);
	edao.insert(e1);
	
}

}