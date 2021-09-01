package myaop;

public interface CustomerBO {

	void addCustomer(String val);
	 
	String addCustomerReturnValue();
 
	void addCustomerThrowException() throws Exception;
 
	void addCustomerAround(String name);
}


