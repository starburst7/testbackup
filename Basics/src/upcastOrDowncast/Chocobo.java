package upcastOrDowncast;

public class Chocobo extends Animal {
	
	private int y=50;
	
	public Chocobo() {
		//note it automatically invokes constructor of base Animal
		this.hello();
	}

	public static void main(String[] args) {
		
		Chocobo choco = new Chocobo();
		
		Animal am = choco;
		
		System.out.print(am.getX());
		
		Chocobo choco1 = (Chocobo)am;
		
		System.out.print(choco1.y);
		
		
		
		
		

	}
	
	
	

	  /**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	// @Overriding will give us a compile error. This tells us that the below is NOT overriding.
	public static void hello() {  //note this is NOT overriding Animal. You cannot override a static method.
		                          //You can only override INSTANCE methods and  "Hide a static method"
		
		System.out.println("Hey");
	}
	
	
}
