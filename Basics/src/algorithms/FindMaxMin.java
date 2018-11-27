package algorithms;

import java.util.Scanner;
 						//NOTE program must be instantiated to work//

public class FindMaxMin {
	
	//Scan an array for maximum or Minimum
	
	
	//OPTION 1:
	public static int FindMax(int[] a) {

		
		int max=a[0];  //note this is NOT inside the loop!!
		
		for (int i=0;i<=a.length-1;i++)
		
		{
		if (a[i]>=max)
			max=a[i];
		
		
		}
		return max;
		}
	
	
	
	
	public static void main(String[]args) {
	
	//FOR OPTION 1:	
		Scanner keyIn = new Scanner(System.in);
		System.out.print("enter array size: ");
	
	int a=keyIn.nextInt();
	int[] c= new int[a];
	
	for (int i=0;i<=c.length-1;i++)
			c[i]=keyIn.nextInt();
	
	System.out.print("The max of the array is: ");
	System.out.println(FindMaxMin.FindMax(c));
	System.out.println();
	
	
	
	
	
	//FOR OPTION 2:
	System.out.println(FindMaxMin.max(1,3,4,5,7,99,100,2203,2030));	   //vararg will automatically create the appropriate array size.
		
	}
	
	//OPTION 2:  WHEN YOU ARE NOT SURE WHAT SIZE THE ARRAY IS GOING TO BE: use Vararg (variable argument).
	
	public static int max(int...arg) {    //appropriate array size will be declared and initialized. 
	
		int largest = arg[0];
		for ( int i = 1; i < arg.length; i++)
		if (arg[i] > largest)
		largest = arg[i];
		return largest;
		
	}
	

	}






