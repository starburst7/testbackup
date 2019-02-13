package lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

             //ArrayList using backing array which doubles in size whenever size is equal to capacity

public class MyArrayList<E> implements List<E> {
    
    private Object[] backingArray;
    private int indexLastElement=-1;
    private int size=0;
    
    public MyArrayList(int capacity) {
        
        backingArray= new Object[capacity];
        
    }
    
    @Override
    public String toString() {
        return "MyArrayList [backingArray=" + Arrays.toString(backingArray) + ", indexLastElement="
                + indexLastElement + ", size=" + size + "]";
    }

    public static void main(String[] args) {
     
        MyArrayList<Integer> listA= new MyArrayList<Integer>(5);
        
        listA.add(0,3);
        listA.add(1,4);
        listA.add(2,88);
        listA.add(3,90); 
       
        System.out.println(listA.indexLastElement);
        listA.printArray();
        System.out.println(listA.indexLastElement);
        System.out.println("size of array: "+listA.size);
        
       
      
     
       System.out.println(listA.remove(0));
       
       listA.printArray();
       System.out.println("size of array: "+listA.size);
        
       listA.add(50);
       listA.printArray();
       System.out.println("size of array: "+listA.size);
       listA.add(55);
       listA.add(60);
       listA.printArray();
       System.out.println("size of array: "+listA.size);
       
       Integer fifty= new Integer(50);
       listA.remove(fifty);
       listA.printArray();
       System.out.println("size of array: "+listA.size);
       
       listA.clear();
       listA.printArray();
       System.out.println(listA.indexLastElement);
       System.out.println("size of array: "+listA.size);
       
       listA.add(0,3);
       listA.add(1,4);
       listA.add(2,88);
       listA.add(3,90); 
      
       System.out.println(listA.indexLastElement);
       listA.printArray();
       
    }
    
    public void printArray() {
        
        for(int i=0;i<=backingArray.length-1;i++)
        System.out.println("index: "+i+", "+"value: "+this.backingArray[i]);
        
        System.out.println();
    }
	
	
	@Override
	public void add(int index, E element) {
		
	    //can only use add method to add elements between index 0 and size+1.  Lists cannot have holes.
	    if((index>size) && indexLastElement!=-1) 
	        throw new RuntimeException("index out of bounds");
	   
	    else {
	    
	        //if adding right after the last element in the array
	    if(index==indexLastElement+1) {
	        backingArray[index]=element; //set the element
	    indexLastElement++;
	    size++;
	    }
	    
	    //adding an item to an index where a previous item was => bump that previous item and all others forward by +1
	    else { 
	        indexLastElement++;
	        size++;
	        //In place copy of elements to the right of original array and make sure it's +1 position when copied.
	        System.arraycopy(backingArray, index, backingArray, index+1,size-index);
	     
	        backingArray[index]=element;
	       
	    }
	    
	    
	    }
	    
	    //increase double size of array IF size of array is equal to capacity.
        if(backingArray.length==size) { 
            backingArray=Arrays.copyOf(backingArray, 2*backingArray.length);
        }
	    
	}
	
	@Override
	public E remove(int index) {
	    
	    E deletedElement;
		
	    if(index>size-1) throw new RuntimeException("index out of bounds");
	    
	    //if removing last element of array
	    if(index==backingArray.length-1) {
	        
	        deletedElement=(E)backingArray[index];
	        backingArray[index]=null;
	        size--;
	        indexLastElement--;
	        
	        return deletedElement;
	    }
	    
	    else { //shift to left, all elements that are to the right of target to delete => copy Array
	        deletedElement=(E)backingArray[index];
	        System.arraycopy(backingArray, index+1, backingArray, index,size-index);
	        size--;
	        indexLastElement--;
	        return deletedElement;
	    }
		
	}
	
	@Override
	public int size() {
		// 
		return size;
	}
	
	@Override
	public void clear() {
		
		backingArray=new Object[1];
		size=0;
		indexLastElement=-1;
	}
	
	@Override
	public boolean add(E e) {
		
	    //increase double size of array if size of array is equal to capacity.
        if(backingArray.length==size) { 
            backingArray=Arrays.copyOf(backingArray, 2*backingArray.length);
        }
        
        backingArray[indexLastElement+1]=e;
        indexLastElement++;
        size++;
        return true;
		
	}
	
	@Override
	public boolean remove(Object o) {
		
	    //loop through backed array to find index of match
	    int matchingIndex=-1;
	    for(int i=0;i<=size-1; i++) 
	    {
	        
	        if(backingArray[i].equals( (E)o) ==true ) {  //Given E type, the base class would need a well defined equal() method
	            matchingIndex=i;
	            break;  //stop as soon as found as we are removing ONLY FIRST OCURRENCE.
	        }   
	    }
	    
	    if(matchingIndex==-1)
	        return false;
	    
	    else {  //match was found. Call remove(index) method
	        this.remove(matchingIndex);
	        return true;
	    }
	    
	
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
	public E get(int index) {
		throw new UnsupportedOperationException();
		
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
