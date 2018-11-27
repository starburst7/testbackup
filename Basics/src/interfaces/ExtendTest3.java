package interfaces;

public class ExtendTest3 extends Test3 implements Cloneable {

	private Test item3;
	

	
	public Object clone() {
		
		/*Since this is a clone method inherited from Test3 which DID have a proper clone method (that catches CNSException)
		 *            YOU DO NOT NEED TO CATCH IT HERE.
		 *  */
		
		
			ExtendTest3 copy= (ExtendTest3)super.clone();
			
			copy.item3=(Test)item3.clone();
			
			return copy;   //NOTE: Method has to return an Object type.  THUS, since copy is type ExtendTest3, it is AlSO an Object type.
		
		
		
		
	}
	
}
