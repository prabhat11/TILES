package com.prabhat.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prabhat.utils.HibernateUtil;

public class testclient {
	Session session = null;
		public static void main(String args[])
		{
			System.out.println("Hibernate One-To-One example (Annotation)");
	        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	        SessionFactory sf2=(SessionFactory) context.getBean("sessionFactory");
	        //SessionFactory sf = HibernateUtil.getSessionFactory();
	        Session session = sf2.openSession();
	        session.beginTransaction();	
	        Ticket_Master tm=new Ticket_Master();
	        User us=new User();
	        us.setUsername("prabhat ranjan");
	        UserAddress ua=new UserAddress();
	        session.save(us);
	        session.getTransaction().commit();
	         session.close();
	         
	       
	         
		}
}
