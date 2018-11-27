package test;

public class Consumable implements Collectible {

	private int itemID;
	private String itemName;
	
	public Consumable(int itemID, String itemName) {
		
		this.itemID=itemID;
		this.setItemName(itemName);
	}
	
	
	public void pickup() {
		
	}
	
public void drop() {
		
	}


public String getItemName() {
	return itemName;
}


public void setItemName(String itemName) {
	this.itemName = itemName;
}
}
