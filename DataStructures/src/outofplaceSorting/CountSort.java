package outofplaceSorting;

import java.util.Arrays;

public class CountSort {
    
    public static void sort(int[] arr) {
        
        int[] countArr= new int[10];
        
        //count array values generated
        for(int i=0;i<=arr.length-1;i++) {
            countArr[arr[i]]++;
        }
        System.out.println("counting array: "+Arrays.toString(countArr));
        
        //generate values of trailling totals
        int sum=0;
        int[] traillingArr=new int[10];
        for(int i=0;i<=countArr.length-1;i++) {
            for(int j=i; j>=0 ; j--) {
                sum+=countArr[j];
            }
            traillingArr[i]=sum;
            sum=0;
        }

        System.out.println("Trailling totals array: "+Arrays.toString(traillingArr));
        
    //code that generates our output array sorted.
        int[] outputArr = new int[arr.length];
       
        //note, we are doing the loop in reverse, which assures a stable sort.
        for(int i=arr.length-1;i>=0;i--) {
            int temp=arr[i];
            outputArr[traillingArr[temp]-- -1]=temp;  
        }
        
        for(int i=0;i<=arr.length-1;i++) {
            arr[i]=outputArr[i];
        }
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
        
        
    }

    public static void main(String[] args) {
        
        int[] a = {1,4,1,2,7,5,2,4,5,8};

        sort(a);
        
        
    }

}
