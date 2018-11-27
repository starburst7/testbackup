package overridingMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import midfielders.*;
import goalkeeper.*;
import agressors.*;
import soccerplayer.*;
import defendercentrebacksweeperwingback.*;


public class RetrievingMembers {

	public static void main(String[] args) {

		Goalkeeper obj1 = new Goalkeeper();
		pullMembers(obj1);
		
		
			}


	
	
	
public static void pullMembers(Object e) {
		
		
		Field[] fields=e.getClass().getDeclaredFields();
	



		System.out.print("if( ");
		for (int i=0;i<=fields.length-1;i++)
		{
		if( (fields[i].getType().toString().equals("int")) ||
			(fields[i].getType().toString().equals("double"))   ||
			(fields[i].getType().toString().equals("long")) || 
			(fields[i].getType().toString().equals("short")) ) 
		 {
				
			
			
			System.out.print("(this."+fields[i].getName()+"=="+"otherObj."+fields[i].getName()+")");
			if(i!=fields.length-1)
				System.out.print("&&\n");
		  }

		else if (fields[i].getType().getSimpleName().toString().equals("String"))
		System.out.print("(this."+fields[i].getName()+".equals(otherObj."+fields[i].getName()+")");
		
		
		
		

		if(i==fields.length-1)
		System.out.print(" );");

		}
	}
	

}
