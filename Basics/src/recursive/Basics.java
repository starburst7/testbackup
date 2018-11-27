package recursive;


class Basics
{
               //recursion notes:     1. subtask to repeat    2. Stopper case(usually decrement to a positive finite value)
	
	
	// Perform something N number of times.
	public static void asterisks(int n) {
		
		if(n>0)
		{
		System.out.print("*");
		asterisks(--n);
		}
	}
	
	// print a decreasing number from n to 1.
		public static void nbDecreaseTo1(int n) {
			
			if(n>=1)
			{
			System.out.print(n--);
			nbDecreaseTo1(n);
			}
		}
		
	//// print increasing number from 1 to n.
		public static void nbIncreasingToN(int n) {
			
			if(n>=1)
			{
				nbIncreasingToN(n-1);
				System.out.print(n);
			}
		
			
		}	
		
	
	
	//reverses order of digits for an integer.   ex: 1234 => 4321  
	public static void digitsBackwards(int n) {                     //remainder  theory of rem10: ex:   35rem10 => last digit = 5
		
		if(n<10)  //validates if integer has at least 2 digits(or there is no need to reverse anything)
		{
			System.out.print(n);     //if only 1 digit, then it is itself the answer.
		}
		
		else
		{
			System.out.print(n%10);    //print rightmost digit of the integer.
			
			digitsBackwards(n/10);     // n/10 gives ALL digits except the rightmost.
		}
		
		
	}
	
	
	
	//Calculate Mod using recursion. logic: as long as n>m keep removing m from itself. 
	// example: 25mod7   25>7 then remove 7   =>  18>7 then remove 7  => 11 >7   then remove 7     3 < 7 so STOP (thus 3 is remainder)
	public static int mod(int n, int m) {														//thus, if n<m  => return n
		
	
		
		System.out.println("n: "+ n);
		if( n< m)
		return n;
		else
		return (mod(n-m,m));
	}
	
	
	//reverse a String
	public static String reverseStr(String n) {
		
		if(n.length()>0) {
		 
		return(  (n.charAt(n.length()-1)) +  (reverseStr( n.substring(0, n.length()-1) )) );  //basically concatenate: last char with all characters before it
																							//  but make sure to recurse method with "all the characters before it"
		
		}
		
		else
			return "";     //respect compiler
		
		
	}
	
	
	//Convert a decimal to a binary(String form)
	public static String convertToBinary(int n) {
		
		String result="";
		if(n>0)
		result=convertToBinary(n/2)+n%2;
		
		return result;
		
		
	}
	
	//Fibonacci sequence
	public static int fibonacci(int n) {
		
		if(n==0) {
			return 0;
		}
		
		if(n==1) {
			
			return fibonacci(0)+1;
		}
		
		if(n>1)
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
		else
			return -1;
		
	}
	
	public static void print(int n) {
		
		if(n>1)
			print(n-1);
			System.out.print(n);
		
		
		
	}
	
	
	//Factorial n!
	public static int factorial(int n) {
		
		if (n>1)
			return n*factorial(n-1);
		
		else if( n==0 || n==1)
			return 1;
		
		else {
			System.out.println("impossible. factorial of negative number is undefined");
			return -1;
		}
		
	}
	
	//Create a recursive with the following events
	//if x is odd:  example=>  f(7)  =>  1*3*5*7 = 105
	//if x is even:  example=> f(8)  => 0+2+4+6+8 = 20
	public static  int multiplyOrSum(int x) {
		

		if(x%2!=0) {
			
			if(x>1) {
				
				return (multiplyOrSum(x-2)*x  );
			}
			
			if(x==1)
				return 1;
			
			else
				return -1;
			
			
		}
		
		else {
			
			if(x>0)
				return (  multiplyOrSum(x-2)+x );
				
			if(x==0)
				return 0;
			
			else
				return -1;
				
		}
		
			
			
			
		}
	
	
	//Create a fibonacci sequence
	public static int fib(int n) {
		
		if(n==0)
			return 0;
		
		if (n==1)
			return fib(0)+1;
		
		if (n>1)
			return fib(n-2)+fib(n-1);
		
		else return(-1);  //example: negative n
		
	}
	
	
	//Sum of squares from 1 to n   (where n>=1 only)
	public static int sumOfSquare(int n) {
		
		if(n>1)
			return (n*n  + sumOfSquare(n-1));
		
		else
			return 1;
		
	}
	
	
 //power function x^n 
	public static int power(int x,int y) {

		
		if((y<0)) {
			
			System.out.print("Illegal argument for this power function.");
			System.exit(0);
		}
		
		if(y>0) {
			
			return ( power(x, y-1) *x); 
		}
		
		else {   //basically if y==0
			return (1);
		}
		
	
}
		
	
		
		
		
		
	
	
	
	
	public static void main(String args[]) {
	
		asterisks(6);
		System.out.println();System.out.println();
		
		digitsBackwards(857);
		System.out.println();System.out.println();
		
		
		nbDecreaseTo1(7);System.out.println();
		nbIncreasingToN(9);System.out.println();
		
		System.out.println("find 25mod7...");
		System.out.println(mod(25,7));System.out.println();
		
		System.out.print(reverseStr("yaD lufrednoW"));System.out.println();
		
		
		
		
		System.out.println(convertToBinary(77));System.out.println();
		System.out.println(fibonacci(1));System.out.println();
		
		System.out.print(factorial(-1));System.out.println();
		
		
		System.out.print(power(-3,0));
		
	
		
	}
	
	
	

	
}
		
		
		

