package interfaces;

public class Test3 implements Cloneable {
	
	private Test item1;
	private Test item2;
	private String description;
	
	
	public Object clone() {   
		
		try {                                    // BECAREFUL. Unlike ExtendTest,  it has not derived a PROPER clone method
			                                     // that has previously caught CNSException
			
			
			Test3 copy= (Test3) super.clone();   //INVOCATION OF CLONE FROM MASTER CLASS OBJECT
			
			copy.item1= (Test)item1.clone();   // invoke redefined clone of Test class and store copy of instance in Test3 object
			copy.item2= (Test)item2.clone();  // invoke redefined clone of Test class and store copy of instance in Test3 object
			
			return copy;    //NOTE: Method has to return an Object type.  THUS, since copy is type Test3, it is AlSO an Object.
			
			
		}
		
		catch(CloneNotSupportedException e) {    //keep compiler happy, mandatory but HAS NO USE.
			return null;
		}
		
		
		
		
	}

}
