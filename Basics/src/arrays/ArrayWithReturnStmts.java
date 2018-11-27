package arrays;

import java.util.Arrays;

public class ArrayWithReturnStmts {

	private static int[] nums = {2,1,2,3};
	private static int[] j = {3,2,1,2,3,1,88,99,33,55,2,3};
	private static int[] k = {};                              ///NOTE: THIS IS AN ARRAY OF LENGTH ZERO.  It does NOT contain the element zero.

	public static void main(String args[]) {
		
		
		System.out.println(no23(nums)); //Scans array and returns true if array does NOT contain a 2 and does not contain a 3  (option 1)
		
		System.out.println(no23v2(nums));  //Scans array and returns true if array does NOT contain a 2 and does not contain a 3 (option 2)
		
		System.out.println(Arrays.toString(makeLast(nums)));  // DOUBLE the size of an array  + make all elements zeroes except keep it's last element the same.
		
		System.out.println(double23(nums));  //Scan array, if there is 2 twice and 3 twice, then return true.
		
		System.out.println(Arrays.toString(fix23(nums)));  //Copy nums array into new array d. 
															//Then scan to see if there is a 2 followed by a 3. Then set the 3 element to 0.
		
		
		
		System.out.println(start1(j,k));    //// Scanning Array j and Array k to see if 1st element is 1....DESPITE k[] HAVING ZERO ELEMENTS.)
		
		System.out.println(Arrays.toString(biggerTwo(j,nums)));   //sums elements of arrays j and nums, then Prints the one with highest sums
		
		System.out.println(Arrays.toString(makeMiddle(j)));
		
	}
	


	
//Scans array and returns true if it contains either a 2 or a 3
//note return statements CANCEL the loop immediately as soon as they are activated (RETURN ACTS LIKE A BREAK STMT)
//this means that the entire array may not be scanned and improper return value may be given.
public static boolean has23(int[] nums) {		
	
	for (int i=0;i<=nums.length-1;i++)

	if((nums[i]==2)||(nums[i]==3))
	return true;

	return false;

}
//Scans array and returns true if array does NOT contain a 2 and does not contain a 3  (OPTION 1)
public static boolean no23(int[] nums) {
	
		boolean answer=true;
		for (int i=0;i<=nums.length-1;i++)
		{
			if(nums[i]==2||nums[i]==3)
			{
			answer=false;
			break;        //note this break serves part of the role of the return stmt which is to cancel the loop immediately upon being activated.
			}
		}	
		return(answer);
		
	}
	
//Scans array and returns true if array does NOT contain a 2 and does not contain a 3 (OPTION 2)
public static boolean no23v2(int[] nums) {

for (int i=0;i<=nums.length-1;i++)
	
	if (nums[i]==2||nums[i]==3)
		return false;        //immediate cancellation of loop if return activated by the triggering of the IF stmt.

return true;        // if the IF STMT is not triggered, then the first return stmt is not activated; thus, the 2nd return stmt is a reachable code.
	
}


// DOUBLE the size of an array  + make all elements zeroes except keep it's last element the same.
public static int[] makeLast(int[] nums) {
	
	int[] c = new int [2*nums.length];   //create new array double the size
		
	c[c.length-1]=nums[nums.length-1];
	
	return c;
}

//Scan array, if there is 2 twice and 3 twice, then return true.
public static boolean double23(int[] nums) {
	  int counter2=0;
	  int counter3=0;
	for (int i=0;i<=nums.length-1;i++)
	{
		if (nums[i]==2)
		counter2++;
	
		if (nums[i]==3)
			counter3++;
	}	
	
	if ((counter2>=2)||(counter3>=2))
		return(true);
	
	return(false);
}

//Copy nums array into new array d. 
//Then scan to see if there is a 2 followed by a 3. Then set the 3 element to 0.
public static int[] fix23(int[] nums) {

	int[]d = new int[nums.length];
	
	for(int i=0;i<=nums.length-1;i++)
		d[i]=nums[i];
	
	for (int i=0;i<=nums.length-1;i++)
		if((nums[i]==2)&&(nums[i+1]==3))
			d[i+1]=0;
	return(d);
}

// Scanning Array j and Array k to see if 1st element is 1 (DESPITE IT AN ARRAY HAVING NO ELEMENTS.)
//and counting them.  

	public static int start1(int[] j, int[] k) {
		int counter=0;
			if   (j.length>0 &&  j[0]==1)    //Verify that Array has at least 1 element 
				  					         // therefore has a 1st element j[0] and k[0]    (before counting     
			counter++;       
			
			if   (k.length>0 &&  k[0]==1)
				counter++;
			return(counter);
		
	}	
	//sums elements of arrays j and nums, then returns the one with highest sums. iF EQUAL, return array j.
	public static int[] biggerTwo(int[] j, int[] nums) {
		
		int sumj=0;
		int sumnums=0;
		
		for (int i=0;i<=j.length-1;i++)
		  sumj+=j[i];
				
		for (int i=0;i<=nums.length-1;i++)
		sumnums+=nums[i];
		
		if ((sumj>sumnums)||(sumj==sumnums))
			return (j);
		
		if (sumnums>sumj)
			return (nums);
		
		return j;   //note: dummy return to avoid compile problems. It will not ever be triggered.
		
		
	}	
	
	
	public static int[] makeMiddle(int[] nums) {
	
	int [] o= new int[2];
	
		o[0]=nums[(((nums.length)-2)/2)];
		o[1]=nums[(((nums.length)-2)/2)+1];
				
	return(o);		
		
	}	
	
	
	
	//Givenn an int array of any length(can be empty) , returns new array of first 2 elements.
	// if given array is smaller than 2 elements, use whatever elements are present.
	
	//(so if original array only has 1 element, new array must be size 1)
	
	public int[] frontPiece(int[] nums) {
		

		if( nums.length>=2)
		{
			int e [] = new int[2];        // if original array size is 2 or larger. New array will be at most length 2.
				e[0]=nums[0];
				e[1]=nums[1];	//copies first 2 elements.
				return(e);
		}
		
		if (nums.length<2)
		{
			int e [] = new int[nums.length];    // size of new array less than 1. Then new array must be of the same size. 
			for (int i=0;i<=nums.length-1;i++)
				e[i]=nums[i];               //since size is either 1 or zero. This loop guarantees whatever amount of elements is copied.
			return(e);
		}
		
		return(nums);  //note dummy or won't compile. We don't actually want this result but it won't be activated
		                  //since 1 of the previous return stmts will surely be triggered first and method will exit.
						
			
		}
	
	
	}	
	
	
	
	
	
	







