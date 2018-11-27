package lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

	private Node head;
	private int size=0;
	private Node position;
	
	public MyLinkedList() {
		head=null;
		size=0;
		position=null;
		
	}

	
public static void main(String[] args) {

		MyLinkedList<String> listA = new MyLinkedList<String>();

		
		listA.add("Amit");
		System.out.println(listA.position+", index: "+listA.position.index+", size: "+listA.size);
	
		listA.add("Joe");
		System.out.println(listA.position+", index: "+listA.position.index+", size: "+listA.size);
	
		listA.add("tras");
		System.out.println(listA.position+", index: "+listA.position.index+", size: "+listA.size);

		listA.add("bat");
		System.out.println(listA.position+", index: "+listA.position.index+", size: "+listA.size);
		
		listA.add("dog");
		System.out.println(listA.position+", index: "+listA.position.index+", size: "+listA.size);
		
		System.out.println(listA.toString());
		listA.remove(4);
		
		System.out.println(listA.toString());
		
		listA.add("bird");
		System.out.println(listA.toString());
		listA.add(3,"elephant");
		System.out.println(listA.toString());
		
		
		System.out.print("thank you");
		
		
}
	
	private class Node{
		
		private Node next;
		private Node previous;
		private int index;
        private E element;
	
		public Node(int index, Node previous, Node next, E element) {
			
			this.index=index;
			this.previous=previous;
			this.next=next;
			this.element=element;
		}
	}
	

	
	
	public void listItems() {
		
		this.position=this.head;
		while (position!=null) {
			System.out.println("index is: "+position.index+", and item: "+position);
			position=position.next;
		}
		System.out.println("size of list: "+this.size);
		
		this.position=head;
	}
	
	
	@Override
	public String toString() {
		
		this.position=head;
		String message="";
		while(position!=null) {
			message+="index is: "+position.index+", and item: "+position.element.toString()+"\n";
			position=position.next;
		}
		
		this.position=head;
		
		return message;
	}


	@Override
	// add first element or add at end of list or between nodes
	public boolean add(E element)
	{
		
		//add first item.
		if(head==null)
		{
			Node first= new Node(0,null,null, element);
			this.head=first;
			this.position=first;
			this.size++;
			return true;
		}
		
		//add to end of list
		else if(this.size>=1)
		{
			
			//if only had 1 item in list
			if(this.position.next==null) {
			
		Node node2 = new Node(this.position.index+1,position,position.next,element);
		this.position.next=node2;
		this.size++;
		position=position.next;
		return true;
			}
			
			else {
				
				// if had more than 1 item in list already. 
				while(position.next!=null)
					position=position.next;
				
				Node node2 = new Node(this.position.index+1,position,null,element);
				this.position.next=node2;
				this.size++;
				position=position.next;
				return true;
				
			}
			
		}
		return false;
	}
	
	
	@Override
	public void add(int index, E element) {
		
		try {
		
		if(index==0) 
		{
			//adding to index 0 , if list was empty
			if(this.head==null)
			{
				Node first= new Node(0,null,null, element);
				this.head=first;
				this.position=first;
				this.size++;
				
			}
			
			//add to index 0, to an non-empty linked list
			else {
				
				this.position=head;
			Node node2 = new Node(0,null,position,element);
			head=node2;
			this.size++;
		
			this.position=head;
			while(position.next!=null) {
				position=position.next;
				position.index++;
			}
			
		}
			
		}
		
		//if index is equal to size. Add at the very end of list.
		else if(index==this.size){
			
			while(position.next!=null)
			position=position.next;
			
			Node nodeLast = new Node(this.size,position,null,element);
			this.position.next=nodeLast;
			this.size++;
			position=position.next;
		}
		
		
		//traverse current position pointer backwards , if user's index is smaller
		else if(position.index>=index)
		{
		while(position.index> index)
			position=position.previous;
		
	Node nodeC = new Node(index, position.previous,position,element);
	position.index++;
	position.previous.next=nodeC;
	this.size++;
	//update all Nodes after inserted Node for their new index values.
	while(position.next!=null) {
		position=position.next;
		position.index++;
	}
		}
		
		// traverse forward if user's index is after index of current position
		else if(position.index<index)
		{
			
			while(position.index< index)
				position=position.next;
		
			
		Node nodeC = new Node(index, position.previous,position,element);
		position.index++;
		position.previous.next=nodeC;
		this.size++;
		
		//update all Nodes after inserted Node for their new index values.
		while(position.next!=null) {
			position=position.next;
			position.index++;
		}
			
			
		}
		
		
		}
		catch(NullPointerException e ) {
			System.out.println("\nError!invalid index");
			System.exit(0);
		}
		
				 
				 
		
		
	}
	
	
	
	@Override
	public int size()  {
		
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public boolean contains(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<E> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	

	@Override
	public boolean remove(Object o) {
		
		//starts at begining of list and traverses and verifies to see if element
		// is inthe list. It applies the equals method of the underlying class E
		// and downcasts the method's argument into an E variable before proceding.
		// Therefore, E must have a valid equals method that will perform the comparison correctly.
		this.position=head;
		boolean answer=false;
	
		while(!position.element.equals((E)o)) {
			position=position.next;
		}
			
			if(position.element.equals((E)o)) {
				answer=true;
				this.remove(position.index);
			}
		
		return answer;
	}
	
	
	@Override
	public E remove(int index) {
		
	//if it's not the last Node	
		if(index!=this.size-1)
		{
		Node temp = null;
		//traverse current position pointer backwards , if user's index is smaller
				if(position.index>=index)
				{
				while(position.index> index)
					position=position.previous;
				

			
		temp=position;
		position.previous.next=position.next;
		position.next.previous=position.previous;
			
			//update all Nodes after inserted Node for their new index values.
			while(position.next!=null) {
				position=position.next;
				position.index--;
			}
			
				}
				
				
				
				
				// traverse forward if user's index is after index of current position
				if(position.index<index) {
					
					while(position.index< index)
						position=position.next;
				
					temp=position;
					
					position.previous.next=position.next;
					position.next.previous=position.previous;
			
				
				//update all Nodes after inserted Node for their new index values.
				while(position.next!=null) {
					position=position.next;
					position.index--;
				}
				
				}
				
				this.size--;
				
				return temp.element;
						 
						 
		}
		
		//if it's the last node
		else {
		while(position.next!=null) 
			position=position.next;
		
	    E temp  = position.element;
	    position.previous.next=null;
	    
		this.size--;
		return temp;
		
		
		}
		
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		
		this.head=null;
	}

	@Override
	public E get(int index) {
		throw new UnsupportedOperationException();//dsfsf
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException();
	}

	

	


	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	

}
