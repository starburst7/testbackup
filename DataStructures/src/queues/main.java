package queues;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class main {
   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    String userIn = sc.nextLine(); 
    
    ArrayQueue<String> q1 = new ArrayQueue<String>(userIn.length());
    Stack<String> st = new Stack<String>();
    
    for(int i=0;i<=userIn.length()-1;i++) {
        st.push(Character.toString(userIn.charAt(i)));
        q1.enqueue(Character.toString(userIn.charAt(i)));
    }
    
    boolean isTrue=true;
    
    while(st.isEmpty()!=true) {
        if (!(st.pop().equalsIgnoreCase(q1.dequeue())) ) {
            isTrue=false;
        break;
        }
    }
    System.out.print("The string is a palindrome? ="+isTrue);
    
    }
       
   }
    



