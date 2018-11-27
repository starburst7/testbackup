package usingAbstract;

public class SavingAccount extends BankAccount {

	private double interestRate;
	
	
	
	
	
	/**
	 * @param acctNb
	 * @param accountName
	 * @param balance
	 * @param interestRate
	 */
	public SavingAccount(int acctNb, String accountName, double balance, double interestRate) {
		super(acctNb, accountName, balance);
		this.interestRate = interestRate;
	}

	
	
	public String toString(){
		
		return (super.toString()+ "and the interest rate is: "+ interestRate+"\n" );
	}
	
	public void setRate(double interest) {
		
		this.interestRate=interest;
	}
	
	public void withdraw(double amount){
		
		System.out.print("It is not possible to withdraw money from: "+this+ "because it is a savings account and you are receiving interest.");
	}
	
	
	
}
