package collectiondemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		Company com=(Company) con.getBean("comp");
		System.out.println("Company name is :"+com.getCompanyname());
		System.out.println("company address :"+ com.getAddress());
		List<Employee> emp=com.getEmp();
		for(Employee e:emp) {
			System.out.println("Name of employee is :"+e.getEmpname());
			
			
		}
		
		

	}

}
