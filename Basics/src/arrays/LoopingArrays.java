package arrays;

import java.util.Arrays;
import java.util.Collection;


public class LoopingArrays { 


	
	public static void main(String[] args) {

		
		// SPECIAL CASES:
		
		/*						System.out.print(zo.length) 									output
		 					 ------------------------------------------------------------      ------------
		int zo[];    		 =>  since variable doesn't have any address. Has no length        compile error
		
		int zo[]=null;  	 => since variable points to null.                                 Run-time=NullPointException
		
		int zo[]={}  		=> variable does point to an array. The array has no elements.     prints  0
		
		
		*/
		
		
		
		
		//FOR EACH LOOP:  ENHANCED LOOP.
		int[] AZE = {1,3,4,5,7,10};
System.out.println("The results of the for each loop(enhanced loop");

		for (int arrayI: AZE)     //reads:  (for every element type int: inside array AZE), starting from index 0 to length-1".
		System.out.print(arrayI);		
		
		
		
		//Another FOR EACH LOOP combined with an alternative to using Arrays
		/*
		 
		 purpose
		 --------------------------------------- 
		 Scan through list of numbers and find how many of them are bigger or equal to 5.
		 Basically, instead of asking user for size of an array and then creating an array
		  and then scanning through array(as we usually do),
		  We use an undefined array(int...a) as a parameter to method
		  and combine it with ENHANCED loop.
		 -----------------------------------------
		 
		 
		 PUBLIC INT METHOD( int...a) {
		 
		int counter=0;
		
		for (int i:a) {        reads: "for each variable of type int inside variable a, do the following..."
			if (i>=5) 
				counter++;
		}
		
		System.out.print("the nb of elements >=5 is" + counter);
		}
		*/
		
		
		System.out.println();
		System.out.println();
		
		
		//Use String class to print a range of elements within array bypassing use of any loops(works for char arrays only)
		char[] chs = { 'a', 'b', 'c',
				'd', 'e', 'f'
				};
				String s = new String(chs, 2, 3);
				System.out.println(s);	
		
		
		
		//Create Array that stores alphabetic characters.
				char[] alpha = new char [26];
				
				for (int i=0, beta='a';i<=alpha.length-1;i++,beta++)   //ex: adding +1 to 'a' gives an integer =98
				{
					alpha[i]=(char)beta;			//98 is casted into a character= 'b' and stored into alpha[0]
					System.out.print(alpha[i]);  //prints content of array: a character
				
				}
				System.out.println();
				System.out.println();
		
				
				
				
		//Declare Array of size 10
		int[] x= new int[10];
		int sum=0;
		
//loop to store integers 1 to 10 in array...then square every element in the array
	for (int i=0;i<=x.length-1;i++)
	{
		x[i]=i+1;
		x[i]=x[i]*x[i];
	}
	
	//PRINT EVERY ELEMENTS OF ARRAY AS A TABLE:
System.out.println("Array Table consisting of all integers from 1 to 10 squared are:\n");
System.out.println("Index\tValue");
for (int i=0;i<=x.length-1;i++)     // loop through every element of array and print
	System.out.println(  i  +  "\t" +  x[i]  );
System.out.println();
System.out.println();

System.out.println("Note that for int[]x array, if we do println(x), it would give:\n " +x+" because x contains the reference/memory address"
		          + " of the array  versus for example x[2] which would give "+x[2]+"\n. Use toString method for printing whole array elements from a reference variable such as x instead ");
System.out.println();
System.out.println();
	

//LOOP TO FIND SUM of every element in array	
	System.out.println("The sum of the array members are: ");
	for (int i=0;i<=x.length-1;i++)
	sum+=x[i];
	System.out.println(sum);
	System.out.println();
	
	
	
//SCAN Array for all elements that are even.	
	System.out.println("The even numbers in the array are: ");
	for (int i=0;i<=x.length-1;i++)
		if (x[i]%2==0)
			System.out.println(x[i]);
	System.out.println();
	System.out.println();
	System.out.println();
	
	
		

// SCAN for all elements of Array that are Prime numbers	
	boolean result=true;
	System.out.println("The prime numbers in the array are: ");
	for (int i=0;i<=x.length-1;i++)
	{
		// THEORY of primes:  Prime numbers only divide by 1 or Themselves. (must exaust integers from 2 to Number itself x[i]
		for (int j=2; j<x[i]; j++)
		{
		
			if (x[i]%j==0)  //j divides element ,not a prime
			{
				result=false;
				break;
			}
			else  // j doesn't divide element, maybe not prime. Divide by next higher j until exaust all possibilities
			{
				result=true;
				
			}
		}
		if (result)
		System.out.println(x[i]);   //is a prime. print it.
	
	}
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	// Find MAX of array 	
	System.out.println("The max of the array is: ");
	int max=x[0];
	for (int i=0;i<=x.length-1;i++)
	{
	if (x[i]>=max)
		max=x[i];

	}
	System.out.print(max);
	System.out.println();
	System.out.println();
	System.out.println();	
	
	
	
	
	
	
	
		x[0]=1;
		x[4]=2;
		x[2]=15;
		x[1]=24;
		x[7]=0;
		x[8]=21;
	
	// FIND MAX OF PRIME NUMBERS: Combines Prime & Max Algorithms
	System.out.print("The max of the primes is: ");
	// Loop to filter all elements of Array that are Prime numbers	
	int[] y= new int[10];
	
		result=true;
		
		for (int i=0;i<=x.length-1;i++)
		{
			
			// THEORY of primes:  Prime numbers only divide by 1 or Themselves. (must exaust integers from 2 to Number itself x[i]
			for (int j=2; j<x[i]; j++)
			{
			
				if ((x[i]%j==0))  //j divides element and element is not equal 1. not a prime
				{
					result=false;
					break;
				}
				else  // j doesn't divide element, maybe not prime. Divide by next higher j until exaust all possibilities
				{
					result=true;
					
				}
			}
			if (result)
			{
				y[i]=x[i];    //Instead of printing primes, store them in new Aray y
			}

		}
		// FIND MAX of array y
		int maxi=y[0];
		for (int k=0;k<=y.length-1;k++)
		{
		if (y[k]>=maxi)
			maxi=y[k];
		}
		System.out.print(maxi);
		System.out.println();
		System.out.println();
		System.out.println();	
	
		
		
//SCAN AND FIND SPECIFIC VALUE IN ARRAY: 21.  	
		int index=0;
		boolean found=false;
		for (int i=0;i<=y.length-1;i++)
		{
			if (x[i]==21)
			{
			found=true;
			index=i;
			break;    //to stop loop from checking and possibly finding duplicates.
			}
		
		}
		
		if (found)
			System.out.println("The array index of the element containing the number is: "+index);
			else
			System.out.println("No element in array with such number");
		System.out.println();
		System.out.println();
		System.out.println();	
		
		
		
		//TEST TO SEE IF ARRAY ELEMENTS ARE ORDERED FROM SMALL TO BIG
		double [] c= {57, 58, 33.5 , 40 };
		boolean answer=true;
		for (int i=0;i<=c.length-2;i++)
		{
			if (c[i]>c[i+1])       //algorithm to Test if array elements are in order.
			{
				answer=false;
				break;
			}
		}
		System.out.print("The result of a test to verify if the array: "+Arrays.toString(c)+"\n is ordered from small to big is: ");
		System.out.println(answer);
		System.out.println();
		System.out.println();
	
		
		//ENHANCED FOR LOOP: FOR EACH
		System.out.println("Using Enhanced for loop...The sum the array elements is:");
		int[] z={3,4,5,6,7};
		int total=0;
		
		for (int j: z)   //for every element type int inside the array z do the following
			total +=j;
		
		System.out.print(total);
		System.out.println();
		System.out.println();
		System.out.println();	
	

	//PRINTING ARRAY ELEMENTS WITHOUT USING LOOPS (ARRAY CLASS)	
	//NOTE: Using Array .toString or .sort  will ONLY work for 1 row.
   //          Thus, for multi-dimensional array, you must use these methods for each row.
		//SEE MULTIDIMENSIONAL ARRAYS//
		
		int[] numbers= {22,7,543,3,100,11,39,42};  //8 elements
		
		
		//printing every element of array AS A STRING.   USING toString method
		System.out.println("Using Array class to print a 1 dimensional(1 row) array's members is:" );
		System.out.print(Arrays.toString(numbers));
		System.out.println();
		System.out.println();
		
		
		
		//SORTING an Array from smallest to highest using ARRAYS.SORT method.
		System.out.println("Using Array class to SORT a 1 dimensional array(1 row):  " );
		Arrays.sort(numbers);
		System.out.print(Arrays.toString(numbers));
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Convert Array of characters to STRING (using String Class constructor)
		System.out.println("Converting an Array of characters {'a','b','c'} in order to print them by using either conversion to String or directly to println");
		char[] abc= {'a','b','C'};
		System.out.println(abc);   //print directly without converting to String.
		
		String sap = new String(abc);  //convert char array to a String first and then print.
		System.out.println(sap);  
	  
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		//Test 2 arrays to see if they occupy same memory address
		
		int[] g = {1,2,3,4,5};
		int[] h = {1,2,3,4,5};
		System.out.print("Using the (g==h) verifies if the memory adresses is the same. \nIt doesn't verify if the elements within the array are the same. Testing it out shows...");
		
		if (g==h)   //or we could have used if (g.equals(h)) // its the same thing !!
			System.out.print("true");
		else System.out.print("false");
		System.out.println();
		System.out.println();
		
		
		//Test 2 arrays for EQUALITY
		System.out.println("Now let's use .equalsArrays(x,y) method of Arrays class to verify equality: ");
		if(Arrays.equals(g,h))
			System.out.print("Arrays.equals(g,h) returned true");
		else
			System.out.print("Arrays.equals(g,h) returned false");
			
		
		if (g.equals(h))
			System.out.print("true");
		else System.out.print("false");
	
		
		
		//CREATE ARRAY OF THE SAME SIZE   //COPY every element of m into array n
		int[] m = {2,4,6,7,9,10};
				
		int[]n = new int[m.length];   
		
		for(int i=0;i<=m.length-1;i++)  
			n[i]=m[i];
		
		
		
		
	}
	}

