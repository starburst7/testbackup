package algorithms;

public class BinarySearch {

	// *** PRECONDITION BEFORE USING BINARY SEARCH ALGORITHM: Array MUST be sorted from small to biggest.***

	
	//if our target value is greater than the value at the middle element chosen,
	//then we must increase our lower bounds to become the middle element.
	//if our target value is smaller than the value at the middle element chosen,
	//then we must decrease our upper bound to become the middle element.
	
	//**basically**  Program shrinks the range of indexes possible(upper or lower bounds).
	//				and chooses a newer middle element each time range is shortened.
							// it does this Until newly chosen middle index is actually the desired target's index.
	
	
	public static void main(String[] args) {
		
		
		int[] array = { 2, 2, 4, 5, 6, 7, 9, 10 };   //MUST BE ORDERED: ASCENDING
		
		int targetValue=4 ; //actual value inside of an unknown array that we are searching for.
		
		
		int lowerBound=0 ;   //set always as 0
		int upperBound=8 ;   //set always as length of array (nb of elements).
		
		while(lowerBound<upperBound) {
														//note middle is an index
			int middle= (lowerBound+ upperBound)/2;    // (L+U)/2 =index of middle   (We do not differentiate for Odd or even number of arrays).
			
			
			
			if (targetValue==array[middle])   //As search space shrinks...this condition becomes true.
			{
				System.out.print("The index that matches the target value is :"+middle);
				break;
			}
			
			
			
			else if (targetValue<array[middle]) {  //target value is smaller, then target must be positioned before the middle element (since array is ordered).
				upperBound=middle; 			// so middle element's index becomes new upper bound index for next iteration of while loop.
											//** THE NEXT ITERATION OF WHILE LOOP will Calculate a newer middle index which will be closer to the POSITION of our desired Target Value.
		}									//This repeats.... UNTIL EVENTUALLY THIS MIDDLE INDEX BECOMES THE POSITION OF OUR TARGET VALUE.
			
			
			else if (targetValue>array[middle])   //target value is greater than middle array, then target must be positioned after middle element(since array is sorted)
			{									//so middle element's index becomes new lower bound index for next iteration of while loop.
				lowerBound=middle;				//** THE NEXT ITERATION OF WHILE LOOP will Calculate a newer middle index which will be closer to the POSITION of our desired Target Value.
			}									//This repeats.... UNTIL EVENTUALLY THIS MIDDLE INDEX BECOMES THE POSITION OF OUR TARGET VALUE.
				
			
			
			
		}
		
		

	}

}
