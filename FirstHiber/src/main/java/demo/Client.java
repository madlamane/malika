package demo;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Hibernate");
		try {
			
		 Configuration conf= new Configuration();
		 conf.configure("hibernate.cfg.xml");
		 
		
		 Session session=conf.buildSessionFactory().openSession();
		 Transaction txn= session.beginTransaction();
		 //Query query=session.createQuery("from Dima");
		 Query q=session.createQuery("update Dima set name=:n where id=:i");
		 q.setParameter("n", "Jake");
		 q.setParameter("i", 19);
		 int a =q.executeUpdate();
		 System.out.println(a);
		 
		 //List user=  query.list(); 
	 txn.commit();
		 session.close();
		 //System.out.println("Size of list "+ user);
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
            ex.printStackTrace();
		}
		

	}

}
