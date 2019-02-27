package simpleHashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Jdk {

    public static void main(String[] args) {
        
        Map<String, Employee> test = new HashMap<String, Employee>();

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        
        test.put("Jones", janeJones);
        test.put("Smith", marySmith);
        
       
        
                /*print key and value(Employee)*/
        
        //option 1: by iterator
        Iterator itr = test.entrySet().iterator(); 
        while(itr.hasNext())
            System.out.println(itr.next() );
        System.out.println();
        
        //option 2: for each
        test.forEach((k,v) -> System.out.println(k+" and "+ v));
        System.out.println();
        
        
        //replace & print hashtable
        Employee temp = test.put("Smith", johnDoe);
        
        Iterator itr2 = test.entrySet().iterator();
        while(itr2.hasNext())
            System.out.println(itr2.next() );
        System.out.println();
        
        //put if key is absent from hashtable and print hashtable
        test.putIfAbsent("Doe",johnDoe );
        Iterator itr3 = test.entrySet().iterator();
        while(itr3.hasNext())
            System.out.println(itr3.next() );
        System.out.println();
        
        
    }

}
