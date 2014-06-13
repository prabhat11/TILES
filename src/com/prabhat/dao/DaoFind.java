package com.prabhat.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.prabhat.model.User;
import com.prabhat.utils.HibernateUtil;
public class DaoFind extends BaseDao {
      private User u;
      private String name1="prabbhat";
      private String name2="prabhat3";
	  private boolean flag=false;
	  SessionFactory factory = HibernateUtil.getSessionFactory();
	  Session session = factory.openSession();		
		//Mybean p;
	  List recList = null;  
	  public boolean findUserByIdAndNme(String username)
	  {    
		   /*System.out.println("hi i am in dao method...."+username);
		   String hql ="from User u where u.username=:username";
		   System.out.println(hql);
		   List result = session.createQuery(hql).setString("username", username).list();
		   System.out.println(hql);*/
		   Query c =session.createQuery("from User u where u.username=:username");
		   c.setString("username",username);
		  /* c.setParameter(pass,pass);*/
		   recList=c.list();
		   System.out.println("got size"+recList.size());
		   if(recList.size()>0)
			  return true;
		   else
			  return false;
		}
	  //here overridding tostring to check whether the value is ..
	  public String toString()
	  {
		return name1.concat(name2);
		  
	  }

		
		  
	  }


