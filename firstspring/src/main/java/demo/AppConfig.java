package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // we will make an entry for all the beans
@PropertySource("classpath:Hello.properties")
public class AppConfig {
	
	@Bean(name="department")
	public Department dept()
	{
		Department d= new Department();
		d.setDeptcode(1234);
		d.setDeptname("Casa");
		
		return d;
	}
	@Bean(name="emp")
	public Employee em()
	{
		Employee e= new Employee();
		e.setFname("Rain");
		e.setLname("Anderson");
		return e;
		
	}
	@Bean(name="emp1")
	public Employee em1()
	{
		Employee e= new Employee();
		e.setFname("Jessica");
		e.setLname("White");
		return e;
		
	}

}
