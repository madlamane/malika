package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeptClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct = new AnnotationConfigApplicationContext(AppConfig.class);
		Department d=(Department)ct.getBean("department");
		System.out.println("Department code: " + d.getDeptcode());
		System.out.println("Department name: " + d.getDeptname());
		System.out.println("City :" + d.getCity());
		Employee e= d.getEmp();
		System.out.println("First name is :" + e.getFname());
		System.out.println("Last name is :" + e.getLname());
		
		
		

	}

}
