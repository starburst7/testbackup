package test;

public class Gold implements Collectible {

	private int gold;
	
	public Gold(int gold) {
		
		this.gold=gold;
	}
	
	
	public void pickup() {
		
		System.out.println("Picked up "+gold+" gold");
		
	}
	
	public void drop() {
		
		System.out.println("Dropped "+gold+" gold");
		
	}
}
