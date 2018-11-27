package CLONEwithCopyConstructor;

public class Animal {

	private int age=0;
	
	private String name;
	
	
	
	/**
	 * @param age
	 * @param name
	 */
	public Animal(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	
public Animal() {
	//do nothing
}


//Clone method using copy constructor
public Animal clone() {
	
	return (new Animal(this));
}



//copy constructor
	public Animal(Animal a) {
		
		if(a==null)
			System.exit(0);
		
		
		else {
		this.age=a.age;
		this.name=a.name; 
		}
	}
	



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}


	
	

	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}





	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}





	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
