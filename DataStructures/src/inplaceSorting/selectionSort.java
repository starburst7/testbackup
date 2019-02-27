package inplaceSorting;

import java.util.Arrays;

public class selectionSort {

    
    public static int[] sort(int[] arr,int m, int n) {
        
    }
    public static boolean compare(int[] a,int i, int j) {
        
        return (a[i]>a[j]);
           
    }
    
    public static void swap(int[] a,int m,int n) {
        
        int temp;
        temp=a[m];
        a[m]=a[n];
        a[n]=temp;
    }
    
    public static void main(String[] args) {

        int[]a = {9,5,7,20,10};
        
        System.out.print(Arrays.toString(sort(a,0,1)));

    }

}
