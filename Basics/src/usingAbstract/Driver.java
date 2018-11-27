package usingAbstract;

public class Driver {

	public static void main(String[] args) {
		
		
		/*NOTES:    superclass: Bank Account is Abstract         subclass1: CheckingAccount          subclass2: SavingsAccount
		
					Problem:  Let's say you want to create ONE array to hold  both types of subclass objects....
					
				              =>  You cannot instantiate BankAccount Objects which means you cannot actually hold BankAccount Objects inside the Array.
				              
				              => You can create Array of BankAccount  BUT store Checking & Savings objects inside it.
				              
				              
				              
				** SIDE NOTE:   
								You will lose the unique Getter/Setter methods of the subclasses since you are implicitly upcasting **
				              
				                 Solution:   Create Abstract method headers for Superclass with those getter/setters of the subclass.
				                 
				                 (This is not demonstrated in this java file. But it's important to understand this).
				              
		
		
		*/
		
		
		
		//create BankArray with 2 empty spaces.
		BankAccount[] arrayBank=new BankAccount[2];
		
		//Create Objects for Savings and Checkings by using the constructors to initialize values.
		arrayBank[0]= new SavingAccount(992211,"Amit",3080,5.78);
		arrayBank[1]= new CheckingAccount(993212,"Amit",22000);
		
		
		//Withdrawing from savings										// BankAccount var type  holding SavingsAccount object
		arrayBank[0].withdraw(75);
		arrayBank[0].getBalance();
		
		System.out.println();
		System.out.println();
		
		
		//Withdrawing from checkings								// BankAccount var type  holding CheckingAccount object
						
		
		arrayBank[1].withdraw(75);
		arrayBank[1].getBalance();
		
		
		System.out.println();
		System.out.println();
		
		

	}

}
