package CLONEwithCopyConstructor;

// WHEN TO CLONE?
//-----------------------
//  Use Clone whenever copying any Array that will hold MULTIPLE different classes of Objects


// STEPS:
//         1)  Create Copy constructor for all classes involved
//         2)  Override clone method using the copy constructor.  Do this for every class involved.
//         
//         3) When copying an array of different Objects. Use the newly created clone() and since
//             clone has the same name in all classes.. this will ensure that late binding and polymorphism works.
//             (this is why Copy Constructors don't work... because they have different names)


public class Dog extends Animal {
	
	private String specie;
	
	public Dog(int age, String name,String specie) {
		
		super(age,name);
		this.specie=specie;
	}
	

	
	// Clone method using Copy constructor BELOW...
public Dog clone() {
		
		return (new Dog(this));
	}
	
	
	//Copy constructor
	public Dog(Dog a) {
		
		if(a==null)
			System.exit(0);
		
		
		else {
			
			this.setName(a.getName());
			this.setAge(a.getAge());
			 this.specie=a.specie; 
		}
		
		
	}
	
	
	public String toString() {
		
		return ( super.toString()+" and specie ="+specie);
	}
	
	
	public static void main(String args[]) {
		
		// Note Array Animal contains Dogs.
		// How do we copy an Array which has BOTH dogs and Animals? We would have to manually use the appropriateCopy constructors
		// for Dog or for Animal for every single element in array.... which is pointless.
		// => SO WE USE CLONE WITH COPY CONSTRUCTOR
		
		
		Animal[] group= new Animal[2];
		
	
		group[0]= new Dog(12,"toby","eskimo");
		group[1]= new Dog(6,"puffy","pomeranian");
		
		
		System.out.print("Using only copy constructor of Animal... note it doesn't produce a Dog.......");
		Animal b = new Animal(group[0]);
		System.out.print(b);
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		//--------------Looping through array and "Cloning" every element within Animal Array
		//                 and using appropriate Copy Constructor if it's either(Dog or Animal)
		
		
		// CLONING WORKS BECAUSE OF POLYMORPHISM => the method clone has the same name in all classes
		//                                           ** THUS, LATE BINDING **
		
		
		// 1)  Create array of same size as original
		
		Animal[]  groupClone = new Animal[group.length];
		
		
		for(int i=0;i<=group.length-1;i++)
		{
			groupClone[i]=group[i].clone();
		}
		
		System.out.print("Using cloning with copy constructor......\n");
		System.out.println(groupClone[0]);
		System.out.println(groupClone[1]);
		
	}

}
