package CLONEwithMasterClone ;

public class Date implements Cloneable {

	protected int month;
	protected int year;
	protected int day;
	
	
	public Date clone() {
		
		try {
			Date copy = (Date) super.clone();   //Master Class Object's clone invocation ( returns Object & throws CloneNotSuppException)
			
			return copy;
			
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
