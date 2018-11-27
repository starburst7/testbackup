package superOrThis;

public class Child extends Parent {

	

	public Child() {
		super(3,4);   //case 1 => Parent has 
		
		
		
		
		
		
		// Case 1: Parent has constructors with arguments NONE of which are A NO-ARG default constructor.
		//-------------------------------------------------------
		//		   =>  The child must ALWAYS explicitly invoke ONE of these constructors with arguments.    
		//		  
		
		
		// Case 2: Parent has a no argument default constructor but no other constructors
		//	       => Child invokes super() explicitly  or it is done automatically super();
		
		//Case 3: Parent has both no-arg and with arg  constructors
		//        => if Child does not invoke explicitly any constructors from Parent, then NO-ARG will be invoked implicitly.
		
	}

	public static void main(String[] args) {
		
		//Creates object 
		Child obj1 = new Child();
		
		//prints with inherited toSTring method  (which was not overwritten).
		System.out.print(obj1);

	}

}
