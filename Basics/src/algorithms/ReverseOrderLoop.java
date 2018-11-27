package algorithms;
import java.util.Arrays;

public class ReverseOrderLoop {

		
		public static void main(String args[]) {
		
			
			//REVERSING AN ARRAY
			int[] nums = {1,2,3};  
			int[] c= new int[3];  //new array to store reversed elements
			for (int i=nums.length-1,j=0;i>=0;i--,j++)  
			{
			c[j]=nums[i];	
			}
		
			System.out.print(Arrays.toString(c));	//toString to convert memory address' content into String
			
			
			
			
			//REVERSING A STRING:  by  reversing its characters with a Loop.
			String word="apple";
			String chng="1";						
			for (int i=word.length()-1; i>=0;  i--)    // EX: 1st iteration: i=length()-1  => charAt(length-1)='e'   
			chng+=word.charAt(i);					// retrives a character and concatenates it with a String.
			System.out.println(chng);			// therefore, the operation becomes   chng = "1" +'e'   
			
			
			
			
			//Reversing Integers without using String class.    -this program returns true if b's digits are the reverse of a's digits.
			int a=4321;
			int b=1234;
			int remA=0;	
			int remB=0;
			int count=0;
			
			while(a>0)     //using theorem: remainder of mod10 is rightmost digit of any integer. 
			{									//used to find total number of digits in integer for array size to be used.
				a=a/10;
				count++;
			}
			int arr1[]=new int[count];
			int arr2[]=new int[count];
			
			
			a=4321;    //resetting a to initial value since it was changed.
			int i=0;
			do
			
			{             //mod 10 theorem: remainder is right most digit of any integer.
			remA=a%10;
			a=a/10;
			
			arr1[i]=remA;       //stores every digit of integer a inside of the array
			i++;
			
		
			}while(a>0);
			
			
			
			i=0;
			do
			
			{
			remB=b%10;
			b=b/10;
			
			arr2[i]=remB;   //stores every digit of integer b inside of the array
			i++;

			}
			while(b>0);
			
			
			
			boolean answer=false;
			
			for (int j=0,k=arr2.length-1;j<=arr1.length-1;j++,k--)   //loop between both arrays in reverse order to see if digits match.
			{
				if (arr1[j]==arr2[k])
				answer=true;
			
				else 
				{
				answer=false;
				break;         //if at any point, it doesn't match. Do not continue. Exit the loop after setting boolean to false.
				}
			
			}
			
			System.out.print(answer);
			
		}
}
