package lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
 
        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add(new Employee("jane","jones",123));
        
        System.out.print(employeeList.get(0));

    }

}
