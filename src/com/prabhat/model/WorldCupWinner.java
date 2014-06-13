package com.prabhat.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class WorldCupWinner {
	 public static void main(String[] args) {
		           Session session = null;
		    try{
                  // This step will read hibernate.cfg.xml and prepare hibernate for use
                  SessionFactory sessionFactory = new AnnotationConfiguration().   
                  configure().addPackage("com.prabhat.dto").buildSessionFactory();
		    	  session =sessionFactory.openSession();
		    
			       
		    }catch(Exception e){
		      System.out.println(e.getMessage());
		    }finally{
		  // Actual contact insertion will happen at this step
		      session.flush();
		      session.close();
		    }		    
	 
		    System.out.println("Inserting Record");
	        Ticket_Master tm=new Ticket_Master();
	        User u=new User();
	        UserAddress ua=new UserAddress();
          
          System.out.println("Done");
		    
	 }

}
