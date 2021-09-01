package demo1;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {
	
   private static SessionFactory factory; 
   public static void main(String[] args) {
	   Configuration conf;   
      try {
    	  conf=new Configuration();
         factory = conf.configure("hibernate.cfg.xml").
                   //addPackage("com.xyz") //add package if used.
                   addAnnotatedClass(Employee.class).
                //   addAnnotatedClass(Department.class).
                   buildSessionFactory();
         Session ses=factory.openSession();
         Transaction tx=ses.beginTransaction();
         Employee e1=new Employee();
         e1.setFirstName("Jake");
         e1.setLastName("USA");
         e1.setSalary(50000);
         ses.save(e1);
         
         //ses.del
         tx.commit();
        
	      
	      
         ses.close();
         /*Employee e3=ses.get(Employee.class, 1);
         System.out.println("First name is "+e3.getFirstName());
         System.out.println("Last NAme is "+e3.getLastName());
         */
         //Employee e4=ses.get(Employee.class, 1);
         //e4.setFirstName("Dimple");
      } catch (Exception ex) { 
    	  System.out.println(ex.getMessage());
    	  ex.printStackTrace();
         System.err.println("Failed to create sessionFactory object." + ex);
      }
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List<Employee> employees 
         = session.createQuery("select e.firstname FROM Employee e").list(); 
         for (Employee employee:employees){
            //Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            //System.out.print("  Last Name: " + employee.getLastName()); 
            //System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
     
      /*------------------------------------------------------------*/
      /*TestEmployee ME = new TestEmployee();

      
      Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
      Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
      Integer empID3 = ME.addEmployee("John", "Paul", 10000);

       List down all the employees 
      ME.listEmployees();

       Update employee's records 
      ME.updateEmployee(empID1, 5000);

      / Delete an employee from the database /
      //ME.deleteEmployee(empID2);

      / List down new list of the employees /
      //ME.listEmployees();*/
   }
   
   /* Method to CREATE an employee in the database */
  /* public Integer addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = new Employee();
         employee.setFirstName(fname);
         employee.setLastName(lname);
         employee.setSalary(salary);
         employeeID = (Integer) session.save(employee); 
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return employeeID;
   }*/
   
   /* Method to  READ all the employees */
   /*public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List<Employee> employees 
         = session.createQuery("select e.firstname FROM Employee e").list(); 
         for (Employee employee:employees){
            //Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            //System.out.print("  Last Name: " + employee.getLastName()); 
            //System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }*/
   
   /* Method to UPDATE salary for an employee */
  /* public void updateEmployee(Integer EmployeeID, int salary ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
         employee.setSalary( salary );
		 session.update(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }*/
   
   /*Method to DELETE an employee from the records */
  /* public void deleteEmployee(Integer EmployeeID){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
         session.delete(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }*/
 
   
}
