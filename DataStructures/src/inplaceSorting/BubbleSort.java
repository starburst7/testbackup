package inplaceSorting;

import java.util.Arrays;

public class BubbleSort {
    

public static void sort(int[] array,int n) {
    
    if(n==1) return;
    
    for(int i=0;i<=n-2;i++) {
    if(array[i]>array[i+1]) {
        swap(array,i,i+1);
    }
    }
    
    sort(array,n-1);
    
   
 
    
}
    
    
    
    public static void main(String[] args) {
        
        int[] array = {20,-3,44,20,-3 };

sort(array,array.length);

System.out.print(Arrays.toString(array));
            }
    public static void swap(int[]array,int i, int j) {
        
        if(i==j)
            return ;
        
        int temp= array[i];
        array[i]=array[j];
        array[j]=temp;
         
        }

    
}
