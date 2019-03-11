package inplaceSorting;

import java.sql.Time;
import java.util.Arrays;

public class InsertionSort {

  
    
    public static void main(String[] args) {
        
      
        
        int[] arr= { 2,4,5,6,7,8,3 };
        

        sort(arr);
        
        printArray(arr);
       

    }
        
    public static void sort(int[]arr) {
            //insert element at arr[i] into correct position of sorted partition but shifts all elements to the right first to make place.
        
        for(int i=1;i<=arr.length-1;i++) {
            
            int hold=arr[i];
            int j=i-1;
            
            /* Move elements of arr[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
         while (j>=0 && arr[j] > hold) 
         { 
             arr[j+1] = arr[j]; 
             j = j-1; 
         } 
         arr[j+1] = hold;
        }  
            
        }
        
        
       
    
    public static void swap(int[] arr, int a, int b) {
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    
    public static void printArray(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }

}
