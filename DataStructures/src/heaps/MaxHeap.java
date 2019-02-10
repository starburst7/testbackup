package heaps;

import java.util.Arrays;

public class MaxHeap {
private int[] heap;
private int size;

public MaxHeap(int capacity) {
    
    heap= new int[capacity];
}
public void setSize(int size) {
    this.size=size;
}
public boolean isFull() {
    return size==heap.length;
}

public boolean isEmpty() {
    return size==0;
}

public int getParentIndex(int index) { //gives us parent's index for a given Node.
    return ( (index-1)/2);
}
public int getLeftChildIndex(int index) {
    return (2*index)+1;
}
public int getRightChildIndex(int index) {
    return (2*index)+2;
}
public int getLargestChildIndex(int index) {
    
    if(heap[getRightChildIndex(index)] > heap[getLeftChildIndex(index)])
        return getRightChildIndex(index);
    
    else
        return getLeftChildIndex(index);
}
 
public void insert(int value) {
    if (this.isFull()) {
        throw new IndexOutOfBoundsException("Heap is full");
    }
    else if(this.isEmpty()) {
        heap[0]=value;
    size=1;
    }
    else{
        heap[size++]=value;
        this.heapifyUp(size-1);   //restores Max Order Property
    }
    
}
public void heapifyUp(int index) {

    while(heap[index]>heap[getParentIndex(index)]) {
    this.swap(getParentIndex(index),index);
    
    heapifyUp(getParentIndex(index));
    
    }
   
    
    }

public int removeMax(int index) {  //the whole purpose of MaxHeaps is to remove max in O(1) time.
    int valueDeleted=0;
    
    if (isEmpty()) {
        throw new IndexOutOfBoundsException("Heap is empty");
    }
    
    else if(size==1) //if only 1 element, then it must be the root(index 0)
    heap[0]=0; 
    
    else {
       
        swap( size-1,0 ); //swap root of tree(index 0) with last node
        
        valueDeleted=heap[size-1];
        heap[size-1]=0;  //delete last node
        size--;
        heapifyDown(0);
        
    }
    return valueDeleted;
    
    
    
    
}

private void heapifyDown(int index) {
    
   if(!isLeaf(index)) {
    int temp=getLargestChildIndex(index);
    if(heap[index]<heap[temp])  
    swap(index,temp);
    
    heapifyDown(temp);
   }
    }
   


    


public void printHeap() {
    for (int i = 0; i < this.heap.length; i++) {
        System.out.print(this.heap[i]);
        System.out.print(", ");
    }
    System.out.println();
}

public boolean isLeaf(int index) {
    if(index>=(size/2) && index<=size) return true;
    
    return false;
}

public void swap(int index1, int index2) {
    
    int temp;
    temp=heap[index1];
    heap[index1]=heap[index2];
    heap[index2]=temp;
}

public void heapifyTree(int lastHeapIndex) {
 
    if(lastHeapIndex!=-1) {
    while(isLeaf(lastHeapIndex)==true) {  //skip all nodes that are leafs since they are automatically max heaps themselves
        lastHeapIndex--;
    }
    this.heapifyDown(lastHeapIndex);
    lastHeapIndex--;
    heapifyTree(lastHeapIndex);
    
    }
}


public static void main(String[] args) {
    
    MaxHeap heapA= new MaxHeap(10);
    
    heapA.insert(2);
    heapA.printHeap();
    heapA.insert(5);
    heapA.printHeap();
    heapA.insert(3);
    heapA.printHeap();
    heapA.insert(9);
    heapA.printHeap();
    heapA.insert(2);
    heapA.printHeap();
    heapA.insert(11);
    heapA.printHeap();
    heapA.insert(4);
    heapA.printHeap();
    heapA.insert(17);
    heapA.printHeap();
    heapA.insert(10);
    heapA.printHeap();
    
    heapA.removeMax(0);
    heapA.printHeap();
    heapA.removeMax(0);
    heapA.printHeap();
    
    
    heapA.insert(55);
    heapA.printHeap();
    heapA.insert(90);
    heapA.printHeap();
    heapA.insert(23);
    heapA.printHeap();
   
    
    //creates a custom binary tree
    MaxHeap heapB= new MaxHeap(9);  //set array size 9
    int[] binTree= {1,23,2,4,30,90,7,2,3};  //store the values
    heapB.heap=Arrays.copyOf(binTree, 9);  //copy it to be used by our program
   heapB.setSize(heapB.heap.length);  //synchronize program with our array's size
   
   //heapifies the binary tree(array)
    heapB.heapifyTree(heapB.heap.length-1);
    heapB.printHeap();
    
    heapB.removeMax(0);
    heapB.printHeap();
}

    
}
