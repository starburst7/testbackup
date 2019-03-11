package inplaceSorting;

import java.util.Arrays;

public class selectionSort {

    
    public static void sort(int[] arr,int n) {
        int indexLargest=0;
        if(n==1) return;
        
        for(int i=1;i<=n-1;i++) {
            if(arr[i]>arr[indexLargest])
                indexLargest=i;
        }
        swap(arr,indexLargest,n-1);
        
        sort(arr,n-1);
        
        
    }
 
    
    public static void swap(int[] a,int m,int n) {
        
        int temp;
        temp=a[m];
        a[m]=a[n];
        a[n]=temp;
    }
    
    public static void main(String[] args) {

        int[]a = {12,5,7,2,8};
        
        sort(a,a.length);
        System.out.print(Arrays.toString(a));

    }

}
