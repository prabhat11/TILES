package com.prabhat.utils.Factory;

import java.util.List;
/**
 * 
 * @author Prabhat
 * @  demostration of singelton design pattern;
 */
public class FactoryClass {
	static FactoryClass fac=null;
	public static FactoryClass getFacory()
	{
		if(fac==null)
		{
			fac=new FactoryClass();
		
	      }
       return fac;
}
	
	}


