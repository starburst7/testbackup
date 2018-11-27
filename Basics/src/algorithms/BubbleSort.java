package algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {9, 8, 7, 6, 5, 4, 3 , 2, 1};
		
		boolean sorter=true;
		
		while (sorter==true)
		{
			
			
			sorter=false;  //*this is key.   
			
		for (int i=0; i<=a.length-2;i++)    //loop from i=0 to last index will only sort FIRST element in proper position.
		{                                  //the booleans will ensure this loop repeat again from index 0 so that each subsequent element is sorted. 
		if (a[i]>a[i+1])					//look at results a print line will display it.
				{
			int temp=a[i+1];
			a[i+1]=a[i];
			a[i]=temp;
			System.out.println(Arrays.toString(a));
			sorter=true;
				}
		}
		
		
	
		}
		

	}

}
