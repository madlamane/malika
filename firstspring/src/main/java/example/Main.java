package example;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		College co=(College) con.getBean("c");
		System.out.println("college code is :"+co.getCollegecode());
		System.out.println("college name :"+ co.getCollegename());
		Set<Student> s= co.getS();
		for(Student s1:s) {
			System.out.println("Student name is :"+s1.getStudentname());
		}
		
		
		
		//College co1=(College) con.getBean("c1");
		//System.out.println("college code is :"+co1.getCollegecode());
		//System.out.println("college name :"+ co1.getCollegename());
		//Student s1= co1.getS();
		//System.out.println("Student name is :"+s1.getStudentname());
		

	}

}
