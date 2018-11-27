package test;

public class ManaPotion extends Consumable {

	private int manaRestored;
	
	
	public ManaPotion(int itemID, String itemName, int manaRestored)
	{	
		super(itemID, itemName);
		this.manaRestored=manaRestored;
	}
	
	
public void pickup() {
		
		System.out.println("Picked up a "+getItemName());
	}
	
	public void drop() {
		
		System.out.println("dropped a "+getItemName());
	}
	
}
