package inplaceSorting;

import java.util.Arrays;

public class ShellSort {

    public static void sort(int[] arr,int gap){
            
        for(gap=arr.length/2 ; gap>0 ; gap /=2) {
            
            for(int i=gap; i<=arr.length-1; i++) {
                int newElement= arr[i];
                
                int j=i;
                
                while(j>=gap && arr[j-gap]>newElement) {
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=newElement;
                
            }
            
        }
            
        }
       
        
        
        
        
    
    
    public static void main(String[] args) {
        
        int[] arr= {9,6,8,7,3,5};
        
       sort(arr,2);
       printArray(arr);
        
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
