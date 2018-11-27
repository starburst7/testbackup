package usingAbstract;

public class CheckingAccount extends BankAccount {
	
	
	private final int maxTransact=3;
	
	private final int fee=2;
	
	
	
	
	/**
	 * @param acctNb
	 * @param accountName
	 * @param balance
	 */
	public CheckingAccount(int acctNb, String accountName, double balance) {
		super(acctNb, accountName, balance);
		
	}



	public String toString(){
		
		return( super.toString()+" the maximum number of free transactions is: "+maxTransact+" and the fee is "+fee );
		
	}
	
	
	
	public void withdraw(double amount){
		
		double balance2=this.getBalance();
		
		this.setBalance(balance2-fee-amount);
		
		System.out.print("The maximum free transactions is: "+maxTransact+" and the fee is "+fee+"\n"+this);
		
		
	}

	

	


	

	
	

}
