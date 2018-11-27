package classesAndmethods;

import java.util.Scanner;



import java.text.NumberFormat;


public class ClassBRelatedtoA {
	

	NumberFormat converter = NumberFormat.getCurrencyInstance();
	Scanner keyIn=new Scanner(System.in);
	
	
	//atributes(fields) that will be part of this class when instantized as an object
	public double Initialbalance=0;   //note this one is public. We will allow the driver Class to modify this attribute
	private double deposit=0;
	private double finalBalance;
	public String name="";

	
	public ClassBRelatedtoA() {
		//do nothing
	}
	
	
	public ClassBRelatedtoA(ClassBRelatedtoA obj1){
		
		this.Initialbalance=Initialbalance;
		this.deposit=deposit;
		this.finalBalance=finalBalance;
	}
	
	
	public String balance()
	{
		
		return (converter.format(Initialbalance));
	}
	
	public String deposit()
	{
		System.out.print("how much do you want to deposit?");
		deposit = keyIn.nextDouble();
		System.out.print("Your new total balance is: ");
		finalBalance=Initialbalance+deposit;
		return(converter.format(finalBalance));
		
	}


	//note two parameters in method's header. These are included here
	
	//instead of attributes.
	
	//these local variables only exist within the method
	
public void printFees(String TypeofFee, double Cost)
{
	System.out.println("The "+TypeofFee+" costs " + converter.format(Cost));

}

public boolean equals(Object otherObj) {
	
	if(otherObj==null)
		return false;
	
	if(this.getClass()!=otherObj.getClass())
				return false;
	
	else {
		
		ClassBRelatedtoA obj2= (ClassBRelatedtoA)otherObj;
		
		if( (obj2.Initialbalance==this.Initialbalance) && (obj2.finalBalance==this.finalBalance  ) && (obj2.deposit==this.deposit )) 
			return true;
		
		else return false;
		
	}
				
	
}



public static void main(String args[]) {
	
	CopyConstructorAndClone ab = new CopyConstructorAndClone();
	
	
	CopyConstructorAndClone abc = new CopyConstructorAndClone(ab);
	

	

	
	

			
			
	
}	

}



