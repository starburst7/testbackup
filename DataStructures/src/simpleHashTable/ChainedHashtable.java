package simpleHashTable;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ChainedHashtable {

    private LinkedList<Employee>[] hashtable;
    
    
    public ChainedHashtable(int capacity) {
        
        hashtable= new LinkedList[capacity];
        for(int i=0;i<=hashtable.length-1;i++)
            hashtable[i]=new LinkedList<Employee>();
    }
    
    public int hashKey(String key) {
        return key.length()%hashtable.length;
    }
    
    public void put(String key, Employee item) {
        int hashKey=this.hashKey(key);
        
        if(hashtable[hashKey].isEmpty())
        hashtable[hashKey].addFirst(item);
        
        else {
            hashtable[hashKey].add(item);
        }
        
    }
    public Employee get(String key) {
        
        int hashedKey=this.hashKey(key);
        
        ListIterator<Employee> itr=hashtable[hashedKey].listIterator();
                
        while(itr.hasNext()==true) {
               Employee temp= itr.next();
               if(temp.getKey().equals(key))
                            return temp;
            }
            throw new NoSuchElementException("Item not found at hashkey: "+hashedKey);
    }
    
    public Employee remove(String key) {
        int hashedKey=this.hashKey(key);
        
        ListIterator<Employee> itr=hashtable[hashedKey].listIterator();
        
        while(itr.hasNext()==true) {
               Employee temp= itr.next();
               if(temp.getKey().equals(key)) {
                            itr.remove();
                            return temp;
                            }
            }
            throw new NoSuchElementException("Item not found at hashkey: "+hashedKey);
    }
    
    public static void main(String[] args) {
        
        ChainedHashtable ht = new ChainedHashtable(10);
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        ht.put("Jones", janeJones);
        ht.put("Smith", marySmith);
        ht.put("Wilson", mikeWilson);
        ht.printHash();
        System.out.println(ht.get("Wilson"));
        
        ht.remove("Wilson");
        ht.printHash();
    }
    
    public void printHash() {
        for(int i=0;i<=hashtable.length-1;i++) {
            ListIterator<Employee> itr=hashtable[i].listIterator();
            
            while(itr.hasNext())
                System.out.println("Hashkey : "+i+", item: "+itr.next());
           
        }
        System.out.println();
        
        
    }
    
    
    
}
