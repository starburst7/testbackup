package simpleHashTable;
  //generic hashtable
public class hashtable2<T> {

    T[] hashtable;
    
    public hashtable2(int capacity) {
       this.hashtable=(T[]) new Object[capacity];
    }
    
    public int hashKey(String key) {
        return (key.length()%hashtable.length );
    }
    
    public void put(String key, T item) {
        
        int hashedKey=this.hashKey(key);
        if(hashtable[hashedKey]==null)
        this.hashtable[hashedKey]=item;
        
        //linear probing for space
        else {
            int stopIndex=hashedKey;
            
            if(hashedKey==hashtable.length-1)
                hashedKey=0;
            else
                hashedKey++;
            
            while(hashedKey!=stopIndex && hashtable[hashedKey]!=null)
            {
                hashedKey=(hashedKey+1)%hashtable.length;
            }
            
            if(hashtable[hashedKey]==null)
                this.hashtable[hashedKey]=item;
            else
                System.out.println("Sorry, there's already an employee at position "+hashedKey);
        }
        
        
    }
  
    public static void main(String[] args) {
        
        hashtable2<Employee> ht= new hashtable2<Employee>(10);
        
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        ht.put("Jane", janeJones);
        ht.put("Wilson", johnDoe);
        
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.put("John", janeJones);
        ht.printHash();
       
    }
    
    public void printHash() {
        for(int i=0;i<=this.hashtable.length-1;i++) {
           System.out.println(hashtable[i]);
        }
    }
}
