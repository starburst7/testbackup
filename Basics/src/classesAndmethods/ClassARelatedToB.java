package classesAndmethods;

public class ClassARelatedToB {

	public static void main(String[] args) {
		
		//create object of Class called "ClassBRelatedtoA", the class defn file
		ClassBRelatedtoA definitionFileObj = new ClassBRelatedtoA();
		
		//modifying an attribute that was declared in the Definition Class file. 
		//This attribute is SPECIFIC to this instanced object called definitionFileObj.
		definitionFileObj.Initialbalance=5;
		
		//call the method of return type String, called balance() from the class definition file
		System.out.print("The previous balance on your account was: ");
		System.out.print(definitionFileObj.balance());
		System.out.println();
		
		
		//call the method of return type String called deposit()  from the class definition file
		System.out.print(definitionFileObj.deposit());
		System.out.println();
		
		//call the VOID method printPrice that asks for 2 parameters in it's header and which are used in it's body.
		definitionFileObj.printFees("monthly fee", 3.50);
		
		

	}

}
