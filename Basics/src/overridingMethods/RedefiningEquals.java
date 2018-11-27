package overridingMethods;


import java.lang.reflect.Field;

import classesAndmethods.ClassBRelatedtoA;
import visibilityInheritance.Parent;


public class RedefiningEquals extends Parent{

	int num=15;
	
	public ClassBRelatedtoA obj3= new ClassBRelatedtoA();
	
	
	
	
	public static void main(String[] args) {
		
	
		RedefiningEquals obj=new RedefiningEquals();
		
	    RedefiningEquals obj2=new RedefiningEquals();
		
	
	  
	    System.out.println(obj.equals(obj2));
	    
	    
	   
	   RetrievingMembers.pullMembers(obj2);

		
		
	}
	
	public boolean equals(Object x) {   //redefine inherited equals method. 
		
		
		if(x==null)      //if x is empty, then it cannot be equal to calling object.
			return false;
		
		else if(x.getClass()!=this.getClass()) {       //if x class is not same as caller class, then cannot be equal.
			return false;
		}
		
			else
			{
				RedefiningEquals y=(RedefiningEquals)x;      // x is a Object variable type holding the TestDriver object. Thus, it does not have access to any fields of TestDriver although they are there.
												// thus, we need to downcast it into a TestDriver object.
				if(y.num==this.num)
					return true;
				
				else
					return false;
			}
				
					
		
	}
	
	
	
	
	

}
