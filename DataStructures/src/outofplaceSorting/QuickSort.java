package outofplaceSorting;

import java.util.ArrayList;
import java.util.Iterator;

public class QuickSort {

   public static int partition(int arr[], int start, int end) 
    { 
       int pivot=arr[end];
       int partitionInd=start;
       for(int i=start; i<=end-1; i++) {
           if(arr[i]<=pivot) {
               swap(arr,i,partitionInd);
               partitionInd++;
           }
       }
       swap(arr,partitionInd,end);
       
       return partitionInd;     
    }
   public static void quickSort(int[] arr, int start, int end) {
       
       if(start<end) {
           int partitionInd=partition(arr,start,end);
           
           quickSort(arr,start,partitionInd-1); //recursive call for left of partition
           quickSort(arr,partitionInd+1,end);   //recursive call for right of partition
       }
   }
    
    public static void swap(int[] arr,int j,int k) {
        
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {7,2,1,6,8,5,3,4}; 
        int n = arr.length; 
  
        
        quickSort(arr,0,arr.length-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 

