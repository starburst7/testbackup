package streams;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class ScannerPrintWriter {

	public ScannerPrintWriter() {
		
	}

	public static void main(String[] args) {
		
Scanner sc=null;
PrintWriter pw=null;

try {
	
	ScannerPrintWriter obj1 = new ScannerPrintWriter();
	
	sc= new Scanner(new FileInputStream("C:/Users/2flare/Desktop/Sunglasses.txt"));
	
	pw= new PrintWriter(new FileOutputStream("C:/Users/2flare/Desktop/Roundglasses.txt"));
	
	obj1.RecordRoundGlasses(sc,pw);

}

catch(FileNotFoundException e) {
	
	System.out.print(e.getMessage());
}



		
	}
	
	public void RecordRoundGlasses(Scanner sc, PrintWriter pw) {
		
	
		String shape="";
		int year=0;
		double cost=0;
		double totalCost=0;
		
	try {	
		
		while(sc.hasNextLine()) {
			
			shape=sc.next();
			if(shape.equals("Round"))
			{
				pw.print(shape+"\t");
				year=sc.nextInt();
				pw.print(year+"\t");
				cost=sc.nextDouble();
				pw.println(cost);
				
				totalCost+=cost;
			
			}

		}
		pw.println();
		pw.println();
		
		
		pw.print("Total value of Round Glasses: "+totalCost);
		
		sc.close();
		pw.close();
		
	}
	catch (IllegalStateException f) {
		System.out.print(f.getMessage());
	}
	catch (InputMismatchException f) {
		System.out.print(f.getMessage());
	}
	catch(NoSuchElementException g)
	{
		System.out.print(g.getMessage());
	}
	
		
			
		
	}

}
