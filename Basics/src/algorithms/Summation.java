package algorithms;


public class Summation {

	
	//Arithmetic summation from 1 to 100
	//1. Start variable i at 1
	//2. Check if the variable is less than or equal 100. Stop otherwise
	//3. add variable i to sum variable.
	//3. Print value of sum
	//4. increase the variable i by 1
	//5. Jump to step 2
	public static void main(String[] args) {
	
	int sum=0;
		for (int i=1;i<=100;i++)
		{
		sum+=i;	
		}
	System.out.println("The sum of all numbers from 1 to 100 is "+sum);	
		sum=0;
		
		
		
		//Sum all square numbers less than 1000
		//1. Start variable i at 0
		//2. Check if the i*i is less than 1000. Stop otherwise
		//3. add result of i*i into sum variable
		//3. Print value of sum
		//4. increase the variable i by 1
		//5. Jump to step 2
		
		for (int i=0;i*i<1000;i++)
			sum+=i*i;
		
		System.out.println("The sum of all square numbers less than 1000 is "+sum);
		sum=0;
		
		
		//future value of 1000$ at 5% compound interest for 100 years.
		double futureValue=1000;
		for (int i=1;i<=100;i++)
		{
			futureValue*=1.05;	
		}
		System.out.println(futureValue);

		
	}

}
