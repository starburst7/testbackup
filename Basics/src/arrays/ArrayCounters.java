package arrays;

import java.util.Scanner;

public class ArrayCounters {
	
	public int money;  //this is created for illustrating fields manipulation in ArrayofObjects class
	
	
	public static void main(String[] args)
	{

		
		
		//scanner
		Scanner keyIn=new Scanner(System.in);

		
		//main code:  Program counts how many children are of each age from age 0 to 10.
		
		int[] ageGroups=new int[11];
		int i;
		
		System.out.println("Please enter ages of 10 children (from 0 to 10) ");
		
		for(int m=0;m<=ageGroups.length-1;m++)      //loop through each array element
		{
			
			i=keyIn.nextInt();
			keyIn.close();
			if (i>ageGroups.length-1)  //error message if user enters number not from 1 to 10.
				System.out.println("User input is not between acceptable...Please try again");
			
			
			else            //**COUNTER**
			ageGroups[i]++;    //user types an input i, then loop adds +1 to appropriate array index i.
		}                       
		
		
		for(int z=0;z<=ageGroups.length-1;z++)  //loop through each array element and print value of each.s
		System.out.println("There are "+ageGroups[z]+"children who are "+z+" years old");

		
		
		
		
	}
	

}
