package algorithms;

import java.util.Scanner;

//to find all multiples between an interval.
// in this case.  All multiples of the variable "value"
//that is in the interval between the variable "value" and variable "limit".

public class FindMultiples {

	public static void main(String[] args) {
	
		final int PER_LINE=5;
		int value, limit, mult,count=0;
		Scanner keyIn=new Scanner(System.in);

		//ask for a value which will be the divisor of the multiples
		System.out.print("Enter a positive value: ");	
		value= keyIn.nextInt();
		
		System.out.print("enter an upper limit: ");
		limit = keyIn.nextInt();
		keyIn.close();
		
		System.out.println("multiples of "+value+" between "+ value+" & "+ limit);
		
		
		for (mult=value;mult<=limit;mult+=value)
			System.out.print(mult+"\t");
		
		//print a specific number of values per line of output
		count++;
		
		if(count % PER_LINE==0)
		System.out.println();
		
	}

}
