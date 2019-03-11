package inplaceSorting;

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
           
           quickSort(arr,start,partitionInd-1); //recursive call for partitioning of left side of partitionIndex
           quickSort(arr,partitionInd+1,end);   //recursive call for partitioning of right side of partitionIndex
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
  
    
    public static void main(String args[]) 
    { 
        int arr[] = {4,5,2,1,3}; 
        int n = arr.length; 
  
        partition(arr,0,arr.length-1);
       System.out.print("first round partition\n"); printArray(arr);
        quickSort(arr,0,arr.length-1); 
  System.out.println();
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 

