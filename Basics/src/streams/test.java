package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class test {

	public static void main(String[] args)
	{
	System.out.print(test.maner(7,3,2,5,5,1,5));
	}
	
	
	public static int maner(int...a) {
		
		int counter=0;
		for (int i:a) {
			if (i>=5) 
				counter++;
		}
		
		return counter;
		}
	}
	


	
	

