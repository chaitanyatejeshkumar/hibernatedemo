package com.wipro.training.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Hibernate application to save a product object in DataBase
//Using XML Configuration
public class ProductApp {

	public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml"); // configures hibernate with DB
         SessionFactory sf=cfg.buildSessionFactory();
         Session session=sf.openSession();  // physical connection with db is established
              
       Transaction t=session.beginTransaction();
      
         // // object in  transient state i.e not associated
       // with any session
         Product p1=new Product();
        
         p1.setName("Optical Mouse");
         p1.setDescription("Logitech M35");
         p1.setPrice(50.00f);
        
         session.save(p1);  // object in persistent state
         t.commit();
         System.out.println("Product Details successfully Saved to DB");
         session.close();  // object in detached state
         sf.close();

	}

}
