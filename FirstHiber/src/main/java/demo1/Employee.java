package demo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "users")

public class Employee {
	@Id
    @GeneratedValue
    private int id;
   
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//@Column(name = "firstName")
	private String FirstName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//@Column(name = "lastName")
	private String LastName;
	//@Column(name = "Salary")
	private int salary;


	@Override
	public String toString() {
		return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", salary=" + salary
				+ "]";
	}
	

}
