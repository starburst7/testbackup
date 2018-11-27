package arrays;
import java.util.Arrays;

/*NOTES FOR UNDERSTANDING:  

Arrays.toString(a) => this is what actually retrieves the value of every element in an array a AS A STRING(It will convert all other data types to String)

int [] b = {1,2,3}   => the letter b only holds the address of the memory of the actual array.
						so System.out.print(b) will NOT print content of the array.

System.out.print(a[i]) will print the actual value of any array (wether it's a String, integer, character.... etc)



NOTE***  ALL ARRAYS ARE MUTABLE: That is, their fields(elements) can be changed.
			for example:  Although Strings themselves are immutable, an array of Strings IS MUTABLE
							 ==> because the elements(which hold references to Strings and not the Strings themselves) 
							 		are modifiable => ex: we can change their references

*/

public class ArrayOfObjects {

	static int answer=1;			//answer is not a variable that is instanced within the loop below. It's static so that it can be accessed in every method.
	
	public static void main(String[] args) {
		
int [] b =  new int [10];    	
double [] c =  {1 , 2, 3 , 4 , 5 , 6 , 1};    


//-------SECTION ON DECLARING, INITIALIZING  VERY IMPORTANT CONCEPTS ---------------

String[] dogs = new String[0];   //create variable called dogs and 
								// make it hold reference which itself
								//will hold another reference for String[] array obj
								//this object will have zero elements.**
								//(also remember, each element in an array of object type will hold a reference to the object)
								//versus an element in an array of primitive type which will hold the actual value of the primitive data.




dogs= new String[1];  //increase the size of the array TO 1 element in TOTAL.
						//NOTE: it doesn't actually increase the size of the array.		
						//       A new array is created and the variable "dogs" points to this new array.
						//any previous data any elements will NOT be copied to new array.


dogs= new String[2];  //increase the size of the array so that there are 2 elements IN TOTAL.
						//A new array is created and the variable "dogs" points to this new array.
						// //any previous data any elements will NOT be copied to new array.

String[] cat = null;    //create a variable called cat to hold a type String[]. 
						// This variable ONLY is initialized to null.  No array is actually created.




String[] hamster;		//declare a variable to hold a type String[] called hamster.
						//***NOTE!!!!! An array is NOT declared!!!  Only the variable is declared.

//--------------------------------------------------------------------------



//creates an array a, that will hold memory locations of 5 future objects of class ArrayCounters. 
ArrayCounters [] a = new ArrayCounters[5];   

//LINE 1//  // prints what's in every element for array a:  Null. No object's in memory
System.out.println(Arrays.toString(a)+" is the value of every element in the array of type ArrayCounter class");     
System.out.println();



//LINE2 /// print the what's stored in array a = memory address 
System.out.println(a+" is the memory address stored inside the variable a  in the code  ArrayCounters [] a = new ArrayCounters[5]");                     // prints memory address stored in a, which refers to the array's location.
System.out.println(); 


////LINE 3//  Code that creates objects and then stores them inside array a (into each of its elements).
		for (int i=0;i<=a.length-1;i++)    
			a[i]= new ArrayCounters();  
													
			
		System.out.println(Arrays.toString(a));     //prints what's in every element in array a(objects): 5 memory adresses.
		System.out.println();
		System.out.println();     


		//Change value of a field(int money) of 3rd object in Array:
		a[2].money=5;
		
		
		
		//LINE 4//		
		
		System.out.println("The memory address of int [] b array is:    " +b);        
		
		//LINE 5//
		System.out.println("and It's elements are:\t\t\t "+Arrays.toString(b));   
		oneMore(b);                   //call the method oneMore with parameter b:  this method increases all values inside array by +1
		
		//LINE 6//
		System.out.println("And using the oneMore(b) method gives us: "+Arrays.toString(b));   //prints every element in b (which were all increased by +1)
		System.out.println();
		System.out.println();
		
		//line 7
		System.out.println("The index of the array element of the array: "+Arrays.toString(c)+"\nthat is not in order is: "+outOfOrder(c));
		System.out.println();
		System.out.println();
		
		
		
		//line 8:    Note .length() versus .length   because we are looking for the length of the STRING and not the length of the array.
		String[] words = {"cake","muffin","juice"};
		System.out.println("The length of the String stored in words[1] is: "+words[1].length());
		System.out.println();
		System.out.println();
	}
		
	
	
	
	//METHOD TO add +1 to all members of an array
	public static void oneMore(int[] b) {     //parameter to supply is an array. Note: it's asking for an array variable which has the adress)
	
		int i;
		for (i=0;i<=b.length-1;i++)    //actual algorithm for increasing every element in array b by +1.
			b[i]=b[i]+1;
		
	}
	
	

	//TEST TO SEE IF ARRAY ELEMENTS IN ORDER
	public static int outOfOrder(double []c) {

		for (int i=0;i<=c.length-2;i++)
		{
			if (c[i]>c[i+1])       //algorithm to Test if array elements are in order.
			{
				answer=i+1;   // if  NOT in order, returns THE INDEX(not the actual value) of the two arrays being compared.
				break;
			}
			else
				answer=-1;   // if in order answer is set to -1
			
		}
				return(answer);
	}
	
	
	
	
				
				
				
	}
	
	

	


