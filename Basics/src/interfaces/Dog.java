package interfaces;

public class Dog implements Caninable,Caninable2 {

	private int age;
	
	private String name;
	
	protected String ID;
	
	private String level;
	


	
	public void setID(int id) {
		this.ID=Integer.toString(id);
	}
	public void canineThreatlevel(String level) {
		this.setLevel(level);
		
	}
	public static void main(String[] args) {
		
		Dog a = new Dog();
		a.setID(22033);
System.out.print(a.ID);

	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
