package queues;

import java.util.List;
import java.util.NoSuchElementException;

public class ArrayQueue<E> {
    
    private Object[] backingArray;
    private int front;
    private int back;
    private int size;

    public ArrayQueue(int capacity) {
        
       backingArray= new Object[capacity]; 
       front=0;
       back=0;
       size=0;
    }
    
    public static void main(String[] args) {

        ArrayQueue<Integer> queueA = new ArrayQueue<Integer>(6);
        
        queueA.enqueue(7);
        queueA.enqueue(10);
        queueA.enqueue(3);
        queueA.enqueue(9);
     
       
        
        queueA.dequeue();
        
        queueA.enqueue(5);
        queueA.dequeue();
        
        queueA.printArray();
        
        
    }
    
    public void enqueue(E element) {
        
 if(size==backingArray.length ) throw new RuntimeException("error, queue is currently full"); 
            
        
        
        if(size==0) {
            backingArray[0]=element;
            back=(back+1)%backingArray.length;  //back wrap-incrementator
            size++;
        }
        
       
        
        else if(back>backingArray.length-1) {
            back=(back+1)%backingArray.length;  
            backingArray[back]=element;
            size++;
        }
        
        else {
            backingArray[back]=element;
            back=(back+1)%backingArray.length;  
            size++;
            
        }
        
    }
    
    public E dequeue() {
        if(size==0) throw new NoSuchElementException("Error Queue is empty");
        E temp=(E)backingArray[front];
        backingArray[front]=null;   //deletion
        front=(front+1)%backingArray.length; //front pointer wrap-incrementor
        size--;
        return (temp);
        
    }
    
    public void printArray() {
        for(int i=0;i<=this.backingArray.length-1;i++)
            System.out.println("index: "+i+", item:  "+backingArray[i]);
    }
    
    
    
    
    

}
