package usingJavaDoc;


/**
 * 
 * 
 * 
 * @author 2flare
 *@see Double
 */
public class UsingJavaDoc {

	private int x=10;
	
/**
 * Constructs a new Test using specified integer as value for field x.
 * 
 * @param b a int value
 */
	public UsingJavaDoc(int b) {
		
		this.x=b;
		
	}

	
	public static void main(String[] args) {
		int j=6,k=5,m=12;
		
				double result;
				result=j/m*k;
				System.out.println(result);
	
		}

	
	
	/**
	 * 
	 * @param a double value
	 * @return a double that is calculated by multiplying parameter by 2.
	 */
	public double DoubleNum(double a)
	{
		return (a*2);
	}
	
}
		
		
		

