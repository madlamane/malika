package demo;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Hibernate");
		try {
			
		 Configuration conf= new Configuration();
		 conf.configure("hibernate.cfg.xml");
		 Session session=conf.buildSessionFactory().openSession();
		 Transaction txn= session.beginTransaction();
		 Vehicle v= new Vehicle();
			v.setVehicleName("car");
		Vehicle v1= new Vehicle();
			v1.setVehicleName("Jeep");
		Vehicle v2= new Vehicle();
			v2.setVehicleName("Mazda");
			session.save(v);
			session.save(v1);
			session.save(v2);
		Dima d= new Dima();
		d.setName("malika");
		d.getVehicle().add(v);
		d.getVehicle().add(v1);
		d.getVehicle().add(v2);
		
	
		session.save(d);
		 txn.commit();
		 session.close();
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
            ex.printStackTrace();
		}
		}
		 

	}


