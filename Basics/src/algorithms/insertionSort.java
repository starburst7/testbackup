package algorithms;

import java.util.Arrays;

public class insertionSort {
	public static void main(String[] args) {
	int[] data= {2,8,5,3,9,4,12,100,1,33};
	
	System.out.print(Arrays.toString(sort(data)));
	}

	
	public static int[] sort(int [] data) {

		int j=0;
	for (int i=0;i<=data.length-1;i++) {
		j=i;
			
			while(j>0 && data[j-1]>data[j]) {
				
				System.out.print("comparing a["+(j-1)+"] versus a["+j+"]\n");
				int temp=data[j-1];
				
				//swap
				System.out.print("Swapping a["+(j-1)+"]"+" with a["+(j)+"]");
				data[j-1]=data[j];
				data[j]=temp;
				j--;
				System.out.println(Arrays.toString(data));
			}
			
		}
		System.out.println();
		return data;
		
	}
	
	
}
