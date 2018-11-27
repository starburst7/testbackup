package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class FindMiddle {

	static Scanner keyIn = new Scanner(System.in);
	private static String word;
	
	
	/*  Index of middle for odd,   lastCharIndex / 2          */
	/* index for even,            totalcharacters/2   */

	public static void main(String[] args) {
		
		 
		System.out.print("Enter a string: ");
		word=keyIn.next(); 
		System.out.println();
		
		//if even word string: get 2 middle
		if(word.length()%2==0)
		{
		System.out.print("The middle 2 characters of this even word is: ");	
		System.out.println(middle2EvenString());
		}
		
		
		//if odd string get 1 middle
		else
		{
			System.out.print("The middle character of this ODD word is: ");	
			System.out.println(middleOddString());
		}	
		
		

		//MIDDLE 3 ELEMENTS OF AN ODD ARRAY
	int[]nums= {3,4,5,7,22};
		int[] c = new int[3];

		System.out.println("the middle 3 elements of an Odd Array is: ");
		c[0]= nums[((nums.length-1)/2)-1];
		c[1]= nums[((nums.length-1)/2)];
		c[2]= nums[((nums.length-1)/2)+1];	
	
		System.out.println(Arrays.toString(c));
		System.out.println();
		System.out.println();

		
		//THE MIDDLE 1 ELEMENT OF AN ODD ARRAY     // index of 1 middle array is (nums.length-1)/2
		int[] d= new int[3];
		
		System.out.println("the middle 1 element of an Odd Array is: ");
		d[0]=nums[0];
		d[1]=nums[(nums.length-1)/2];
		d[2]=nums[nums.length-1];
		System.out.println(Arrays.toString(d));
		System.out.println();
		System.out.println();
	}
	
	
	//   ***ACTUAL Algorithm for finding middle 2 characters of a String using substring method.
	
	
	//for EVEN
	public static String middle2EvenString() {
		
																						
																					//(total characters/2)+1   for index of 1st middle character , add +2 for 2nd middle character
		String a= word.substring((word.length()/2)-1,((word.length()/2)+1));       					//or (a-2)/2                   , add +2 for 2nd middle character
																							// note the +2  is to offset substring 2nd term exclusivity.			
		return(a);
	}
	
	//for ODD
	public static String middleOddString() {
			
			char a= word.charAt((word.length()-1)/2);                     // LastCharIndex(length-1)  divided by 2   
			
			String b = Character.toString(a);
			return(b);	
		
		
		
	}
	
		

	
	
	
	
	}


