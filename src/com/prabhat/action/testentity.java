package com.prabhat.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.prabhat.model.User;
import com.prabhat.utils.HibernateUtil;

public class testentity {
	Session session = null;
		public static void main(String args[])
		{
			System.out.println("Hibernate One-To-One example (Annotation)");
	         
	        SessionFactory sf = HibernateUtil.getSessionFactory();
	        Session session = sf.openSession();
	        session.beginTransaction();	
	        User us=new User();
	        us.setUsername("Prabhat");
	        us.setAge(29);
	        us.setGender("Male");
	        us.setHobbies("Reading");
	        us.setJobtype("Permanent");
	        session.save(us);
	        session.getTransaction().commit();
	         session.close();
	         
	       
	         
		}
}
