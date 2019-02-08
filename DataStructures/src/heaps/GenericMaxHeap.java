package heaps;

import java.lang.reflect.Array;

public class GenericMaxHeap<T extends Number & Comparable<T> > {
    
    
    private T[] heapArray;
    private  int size;
    
    
    public GenericMaxHeap(Class<T[]> clazz,  int capacity) {
        
        heapArray = clazz.cast(Array.newInstance(clazz.getComponentType(), capacity));
                
    }
    
    public boolean isFull() {
        
        return this.size== heapArray.length;
        
    }
    
    public void insert(T node) {
        
        if (this.isFull())
            throw new IndexOutOfBoundsException("Heap is full");
        
        else {
            this.heapArray[this.size++]=node;
        }
        
        this.fixHeapAbove(size);
        size++;
    }
    
    public void fixHeapAbove(int index) {
        T newNode = this.heapArray[index];
        
        while( (index>0==true) && (newNode.compareTo(this.heapArray[getParent(index)])>1) ) {
            this.heapArray[index] = this.heapArray[getParent(index)];
            index = getParent(index);
        }
        
        heapArray[index] = newNode;
    }
    
    public int getParent(int index) {
        
        return (index-1)/2;
    }
     
    
    
    public static void main(String[] args) {
       
        GenericMaxHeap<Integer> maxHeap= new GenericMaxHeap<Integer>( Integer[].class , 5   );
   
        
        maxHeap.insert(3);
        maxHeap.insert(3);
    }

}
