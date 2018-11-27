package upcastOrDowncast;

public class Animal {
	
	private int x=10;
	
	public Animal() {
		this.hello();
	}
	
	
	public static void hello() {
		System.out.println("Salute");
		
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

}
