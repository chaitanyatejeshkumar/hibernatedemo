package com.wipro.training.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Hibernate application to save a product object in DataBase
//Using Annotation Configuration-JPA

public class StudentApp {

	public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml"); // configures hibernate with DB
         SessionFactory sf=cfg.buildSessionFactory();
         Session session=sf.openSession();  // physical connection with db is established
              
       Transaction t=session.beginTransaction();
      
         // // object in  transient state i.e not associated
       // with any session
         Student s1=new Student();
        
        s1.setName("Gavin King");
        s1.setBranch("Electronics");
        s1.setMarks(80);
        
         session.save(s1);  // object in persistent state
         t.commit();
         System.out.println("Student Details successfully Saved to DB");
         session.close();  // object in detached state
         sf.close();


	}

}
