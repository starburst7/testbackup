package algorithms;

public class SumDigits {

	public static void main(String[] args) {
		
//algorithm to find sum of digits of any numbers.		
		 int number = 123456; 
	        int sum = 0;
	        int num;
	        
	        
	        for(num = number; num > 0; num /= 10) 
	        {
	            sum += num % 10;        //sum of remainders  for the result of each time num is divided by 10
	            						//**in other words, when dividing ANY number by 10, the remainder is always the rightmost digit.
	        }
	        System.out.println(sum); //prints 21
	    
	        
	        
// reverse the order of all digits of a number
	        System.out.print("the reverse of 20893023 is ");
	        int n=20893023;
	        int count = 0;
	        
	        while (n > 0)    //for determining how many elements needed for array
	        {
	        	n /= 10;
	        	++count;
	        }
	        
	        
	        int[] a = new int[count];   //create array of needed size
	        
	        
	        n=20893023;    
	        for (int i=0; n>0; i++)     //remainder of number is rightmost digit. Thus, store rightmost digit to array(from left to right).
	        {
	        	a[i] = (n % 10);
	        	n /= 10;
	        }

	        for (int i=0;i<=a.length-1;i++)   //loop to print results.
	        System.out.print(a[i]);
	        
	        
	        
	        System.out.println();
	        
	        
	        
//algorithm to numbers between 1 and 1000 that have digits that sum to 10.	
	 for(number = 1; number <= 1000; number++) 
	 {
		 
         sum = 0;
         for(num = number; num > 0; num /= 10)      //algo that finds sum of digits of any number.(or sum of all remainders of Mod10).
         {
             sum += num % 10;
         }
         
         
         if(sum == 10)							//verify if sum above is equal to 10
         {
             System.out.println(number);
         }
         
         
     }

		
	}
}




