package myaop;

import org.springframework.context.*;
import org.springframework.context.support.*;


public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = 
	new ClassPathXmlApplicationContext("BeansSpring.xml");

		CustomerBO customer = (CustomerBO) 
				appContext.getBean("customerBo");
		System.out.println("Add Customer method will run");
	customer.addCustomer("Dimple");
	//LoginValid l=(LoginValid)appContext.getBean("login");
	//l.valid();
		
	
	//System.out.println("Add customer around method will run");
	//customer.addCustomerAround("XYZ");
		
		//customer.addCustomerThrowException();
		
		//customer.addCustomer();
		/*String s=customer.addCustomerReturnValue();
		System.out.println("value returned by method is "+s);*/
	}
}

