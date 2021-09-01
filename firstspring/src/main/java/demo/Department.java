package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // to make it as part of spring frame work
@Qualifier("dep1")
public class Department {
	
	//@Value("11")
	private int deptcode;
	
	@Value("${dept_name}")
	private  String deptname;
	
	//@Value("Chicago")
	private String city;
	@Autowired
	@Qualifier("emp1")
	private Employee emp;
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	
	

}
