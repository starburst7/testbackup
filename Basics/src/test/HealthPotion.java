package test;

public class HealthPotion extends Consumable {

	private int healthRestored;
	
	
	public HealthPotion(int itemID, String itemName, int healthRestored)
	{
		
		super(itemID, itemName);
		this.healthRestored=healthRestored;
		
	}
	
	
	public void pickup() {
		
		System.out.println("Picked up a "+getItemName());
	}
	
	public void drop() {
		
		System.out.println("Dropped a "+getItemName());
	}
	
	
	
}
