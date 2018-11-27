package usingAbstract;

public abstract class BankAccount {
	
	private int acctNb;
	private String accountName;
	private double balance;
	
	
	
	
	
	/**
	 * @param acctNb
	 * @param accountName
	 * @param balance
	 */
	public BankAccount(int acctNb, String accountName, double balance) {
		
		this.acctNb = acctNb;
		this.accountName = accountName;
		this.balance = balance;
	}


	public String toString(){
		
		return ( "The account number is: "+acctNb+" the account name is: "+accountName+ ", the balance is: "+balance+"\n");
		
	}
	
	
	
	



	public int getAcctNb() {
		return acctNb;
	}







	public void setAcctNb(int acctNb) {
		this.acctNb = acctNb;
	}







	public String getAccountName() {
		return accountName;
	}







	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}







	public double getBalance() {
		return balance;
	}







	public void setBalance(double balance) {
		this.balance = balance;
	}







	public abstract void withdraw (double amount);



}

