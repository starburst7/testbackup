package linkedLists;

import java.nio.file.Watchable;
import java.util.NoSuchElementException;

public class GroceryList implements Comparable{

	private Node head;
	

	public int compareTo(Object other) {
		
		return 1;
		
	}
	
public GroceryList() {
	
	head=null;
}

//Method to create an iterator object for the GroceryList object.
public Iterator iterator() {
	
	return ( new Iterator() );
}




private class Iterator{
	
	private Node position;
	private Node previous;
	
	public Iterator() {
		
		position=head;
		previous=null;
		
	}
	
	
public void restart() {
		
		position=head;
		previous=null;
	}
	
	
	/**Verifies if position points to another node(or has reached the end of the list)
	 * @return boolean value
	 */
	public boolean hasNext() 
	{
		
		if(position!=null)
			return true;
		
		else
			return false;
	}
	
	
	public String next() {
		
		if(!hasNext()) throw new NoSuchElementException();
		
	   String itemName2 = position.itemName;
	   
		previous=position;
		position=position.link;
		
		return itemName2 ;
		
	}
	
	/**Deletes specific node index.
	 * @param index is an int
	 */
	public void deleteFromIndex(int index) {
		
		this.restart();
		
		if (position==null) throw new IllegalStateException();
		
		
		if(index==0) {  //remove 1st node
			head=head.link;
			position=head;
		}
	
		else {
			
		
		int counter=0;
		while(this.hasNext() && counter<index) {
			
			this.next();
			counter++;
		}
		this.previous.link=position.link;
		this.position= position.link;
		
		}
		
		
	}
	
	
	
	
	
	
}// END OF ITERATOR INNER CLASS


	
	private class Node{
		
		Node link;
		String itemName;
		
		Node()
		{
			link=null;
			itemName=null;
		}
		
		
	 
		Node(String item,Node link){    	//used by  addToStart() method
			
			this.itemName=item;
			this.link=link;
		}
	
	} /////  END OF INNER NODE CLASS ///////
	
	
	
	
	
	
	// add a new item at the very start of the list
	public void addToStart(String item) {
		
		head = new Node(item, head);     //invokes constructor Node(String name, Node link)
	}
	
	
	//traverse list and print attribute itemName. **NOTE it prints as LAST IN FIRST OUT
	public void outList() {
		
		Node position = head;    //always start at head for traversing (because head points to first item in list)
		
		while(position!=null) {  //until end of list
			
			System.out.println(position.itemName);
			
			position=position.link;     //move up list "incrementor"
		}
		
	}
	
	// delete first item (NO need to traverse!)
	public boolean deleteFirst() {
		
		if(head==null)     //means list is empty. So nothing to delete.
			return false;
		
		else {
			
			head = head.link;     //Header should always point at 1st node. So make header point to 2nd note(thereby removing 1st)
			
			return true;
		}
		
		
	}
	
	//count size by traversing
	public int size() {
		
		Node position=head;
		
		int count=0;
		
		while(position!=null)
		{
			count++;	
			
			position= position.link;   //incrementor
		}
		
		return count;
		
	}
	
	
	//Search list for first matching Node object containing the item  (by traversing)
	public Node find(String target) {
		
		Node position=head;
		

		while(position!=null) {
			
			if(position.itemName.equals(target))
					{
				return position;
					}
			
			position=position.link;    //incrementor
		}
		return null;
		
	}
	
	
	//delete ALL from list
	public void deleteAll() {
		
		head=null;
	}
	
	
	
	
	public static void main(String[] args) {
	
		GroceryList list1 = new GroceryList();
		
		list1.addToStart("banana");
		list1.addToStart("apple"); 
		list1.addToStart("cereal");        // result IN ORDER:    bread , turkey, cereal, apple, banana
		list1.addToStart("turkey");     
		list1.addToStart("bread");          //  ** NOTE LIFO!! **

		list1.outList();
		
		System.out.println();
		
		
		System.out.println("size of list is: "+list1.size());
		
	System.out.println();
	System.out.println();
		
		GroceryList.Iterator i = list1.new Iterator();
		
	
	i.restart();
i.deleteFromIndex(0);
	list1.outList();
		
	
	/*
	 * 	i.next();
	i.next();
	i.previous.link=i.position.link;
	i.position=i.position.link;
	 */
	
	}

}
