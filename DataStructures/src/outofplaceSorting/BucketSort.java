package outofplaceSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class BucketSort {

    public static void bucketSort(int[] arr) {
        
        List<Integer>[] buckets = new List[10];
        
        for(int i=0;i<=buckets.length-1;i++) {
            buckets[i]=new ArrayList<Integer>();    //we can change ArrayList any concrete class implementing List
        }                                      // (ex: Linkedlist,Vector,Stack )
        
        //scattering phase and storing into each buckets
        for(int i=0;i<arr.length;i++) {
            buckets[hash(arr[i])].add(arr[i]);
        }
        
        //sorting
        for (List bucket: buckets)
            Collections.sort(bucket);
        
        //for each bucket, traverse that bucket and copy values into input array
        int j=0;
        for(int i=0;i<buckets.length;i++) { //traverse buckets array
            for(int value: buckets[i]) {  //traverse list
                arr[j++]=value;
            }
        }
        
    }
    
    public static int hash(int value) {
        return value/(int)10;
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 54,46,83,66,95,92,43};
        
        bucketSort(arr);
        
        for (int i=0;i<=arr.length-1; i++)
            System.out.println(arr[i]);

    
    }

}
