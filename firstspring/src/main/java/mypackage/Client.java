package mypackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
		//Constructor based injection can be used to create immutable objects.
		//it can be used when we have less number of properties
		
		//Setter based injection it provides u more flexibility and should be used when u have so many properties
		//we can implement application context using two classes: classpathXml and filesystemXml
		
		ApplicationContext con = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Student s=(Student) con.getBean("st");
		System.out.println("Student name is :"+s.getStudentname());
		System.out.println("Student id :"+ s.getStudentid());
		Course c=s.getCr();
		System.out.println("course name is "+c.getCoursename());
		
		Student s1=(Student) con.getBean("student1");
		System.out.println("Student id :"+ s1.getStudentid());
		System.out.println("Student name is :"+s1.getStudentname());
		
		//System.out.println("Student marks :"+ s1.getMarks());
		
		Course c1=s1.getCr();
		System.out.println("course name is "+c1.getCoursename());

	}

}
