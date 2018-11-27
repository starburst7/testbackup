package superOrThis;




public class Parent {

	private int acctNum;
	private int balance;
	private String name;
	
	
	
	
	public Parent(int x, int y) {    //note There is a constructor with argument provided in this Parent Class.
		//                           //  (but there is no constructor with NO-ARGUMENTS)
		                             //   THUS, it will be mandatory for the Child to explicitly invoke this specific constructor.
		
		acctNum=x;
		balance=y;
	}
	
	
	
	public String toString() {
		
		return this.acctNum+""+this.balance+""+this.name;
		
	}
	
	public void setName(String s) {
		
		name=s;
	}
	
	
}
