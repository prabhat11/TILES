package com.prabhat.action;
import com.prabhat.bean.UserBean;
import com.prabhat.dao.DaoFind;
public class Login {  
   private UserBean us;
   private boolean chk;
   
public UserBean getUs() {
	return us;
}

public void setUs(UserBean us) {
	this.us = us;
}

public String execute(){ 
	System.out.println("i am in execute method....");
	DaoFind dao=new DaoFind();
	System.out.println("object create of daofind..Verifiying user detailn from db.."+dao);
	System.out.println("the name pass as actual argument is as follows..."+getUs().getName());
	chk=dao.findUserByIdAndNme(getUs().getName());
	if(chk){
		System.out.println("success is returned...");
		return "success";
	}		else
		return "error";
}  
 
 
}

