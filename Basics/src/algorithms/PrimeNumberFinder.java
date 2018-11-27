package algorithms;

import java.util.Scanner;

public class PrimeNumberFinder {

	public static void main(String[] args) {

		Scanner keyIn = new Scanner(System.in);
		keyIn.close();
		boolean result = true;

		//repeat Prime checking algorithm for numbers ]2,2000[
		for (int i = 3; i < 2000; i++)
		{
			//PRIME CHECKING ALGORITHM		
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) // if i is divisible by j, then i is not prime
				{
					result = false;
					break;  //leave loop. Stop verifying i for factors.
				}
				else              // if i is not divisible by j, it might be prime. Continue loop to verify for factors.
					result = true;
					break;
			}
			if (result==true)
				System.out.println(i);

		}
	}

}
