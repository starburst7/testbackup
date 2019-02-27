package outofplaceSorting;

import java.util.Arrays;

public class mergeSort {
    
    /**Splits original array into 2 arrays: left and right 
     * @param low
     * @param high
     */
    public static void mergeSort(int[] arr,int size) {
       
    //partitioning "splitting array"    
        if(size==1) 
            return;   //base case. Stop splitting once our arrays are length 1
        
        int mid=size/2;
        int[] leftArr= new int[mid];
        int[] rightArr=new int[size-mid];
        
        //copy left half of arr
        for(int i=0; i<mid; i++)
            leftArr[i]=arr[i];
        
        //copy right half of arr
        for(int i=mid; i<size; i++)
            rightArr[i-mid]=arr[i];
         
        //recursively split our leftArr and rightArr
        mergeSort(leftArr,mid);
        mergeSort(rightArr,size-mid);
        
        merge(arr,leftArr,rightArr,mid,size-mid);
    }
    
    public static void merge(int[] arr, int[]leftArr, int[] rightArr, int leftInd, int rightInd) {
        
        int i = 0, j = 0, k = 0;
        while (i < leftInd && j < rightInd) {
            if (leftArr[i] <= rightArr[j]) { 
                arr[k++] = leftArr[i++];  //if left array is smaller, store its value first. 
            }
            else {
                arr[k++] = rightArr[j++]; //right array has smaller, store its value in original array
            }
        }
        while (i < leftInd) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightInd) {
            arr[k++] = rightArr[j++];
        }
        
    }
    
    public static void main(String[] args) {
     
        int[] a= {0,3,1,2,5,7};
        
        mergeSort(a,a.length);
        
        System.out.print(Arrays.toString(a));
       
        System.exit(0);
    }

}
