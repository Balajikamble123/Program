package com.scp.java.hibernate.HibernateInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
// hibrnate change
//first
// second
public class TestHibernate {

	public static void main(String[] args) {
      Mobile m1=new Mobile(1111, "Mobile", 15000);
      Android a=new Android(2222, "samsung", 15000, "playStore");
      Iphone i=new Iphone(33333, "Iphonex", 60000, "appleStore");
      
      Configuration configuration=new Configuration();
      configuration.configure("hibernate.cfg.xml");
      SessionFactory sfactory=configuration.buildSessionFactory();
      Session session=sfactory.openSession();
      Transaction tr=session.beginTransaction();
      session.save(m1);
      session.save(a);
      session.save(i);
      session.flush();
      tr.commit();
      System.out.println("Successfully Completed");
      
      
	}

}
