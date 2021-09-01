package employeedao;

import java.util.*;
import employeedto.Employee;
public interface EmployeeInter {
	public void insert(Employee emp);
	public void delete(int empid);
	public List<Employee> selectAll();
	public Employee getEmp(int empid);
	
}

