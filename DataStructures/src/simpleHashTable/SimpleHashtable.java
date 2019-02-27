package simpleHashTable;

public class SimpleHashtable {

    private Employee[] hashtable;
    
    public SimpleHashtable() {
        
       this.hashtable=new Employee[10]; 
    }
    
    private int hashKey(String key) {
        return key.length()%hashtable.length;
    }
    
    private boolean occupied(int index) {
        return hashtable [index]!=null;
    }
    
    public void put(String key,Employee employee) {
        int hashedKey=hashKey(key);
        if(occupied(hashedKey)) 
        {
            int stopIndex=hashedKey;
            if(hashedKey==hashtable.length-1)
                hashedKey=0;
            else
                hashedKey++;
        
        while(occupied(hashedKey)&&hashedKey!= stopIndex) 
           {
            hashedKey=(hashedKey+1)%hashtable.length;
           }
        }
        
        if(occupied(hashedKey))//our implementation doesn't handle collisions.
            System.out.println("Sorry, there's already an employee at position "+hashedKey);
        else 
            hashtable[hashedKey]=employee;    
    }
    
    public Employee get(String key) {
        int hashedKey=hashKey(key);
        
        return hashtable[hashedKey];
    }
    public void printHashtable() {
        for(int i=0;i<=hashtable.length-1;i++)
            System.out.println("hashkey: "+i+", object: "+hashtable[i]);
    }
    
    public static void main(String[] args) {
        
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        SimpleHashtable ht = new SimpleHashtable();
        
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        
        ht.printHashtable();
        
       
    }

}
