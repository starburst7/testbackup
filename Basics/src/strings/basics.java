package strings;

import java.util.Arrays;

public class basics {

	public static void main(String[] args) {
	
		String v="hello";
		
		//You cannot concatenate 2 characters because java sees the (+) as an addition of two unicode numbers
		System.out.println(  "james".charAt(0)  +  "james".charAt(1)  );  // 'j'=106 + 'a'=97  = 203
	
		
		
		//You can concatenate a String WITH a character. 
		System.out.println(v+ '1');				//Java converts the character to a string.
		System.out.println();
		
		
		
		// 1- Reversing a String and adding Tab spaces between characters by:  reversing its characters with a Loop.
		String word="apple";
		String chng="";						
		for (int i=word.length()-1; i>=0;  i--)    // EX: 1st iteration: i=length()-1  => charAt(length-1)='e'   
		chng+=word.charAt(i)+"\t";					// retrives a character and concatenates it with a String.
		System.out.println(chng);			// therefore, the operation becomes   chng = "1" +'e'   
		
		System.out.println();
		System.out.println();
		
		
		
		// 2-  REPLACE METHOD:  does NOT change what is stored in original String(Strings are immutable).
		word.replace("apple","jones");        //but is useful for printing a different messsage
		System.out.println("2-"+word);   
		
		System.out.println(word.replace("apple", "jones"));  
		System.out.println();
		System.out.println();
		
		
		
		
			
		//  3-   Store each word of a sentence as elements of a String Array:  SPLIT method
		String sentence= "All your base are belong to us";
		String[] a = sentence.split(" ");       //everything between a space converts into a string
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		//   4-   VERIFY IF STRING ENDS WITH SPECIFIC SUFFIXE
		String str="oddly";
		
	//   5-   using EndsWith method  (fastest)
		System.out.println(str.endsWith("ly"));
	
	//6-     using substring.   ****note special care in case original string is smaller than 2*****
		if(str.length()<2)
			System.out.print(false);
		else 
			System.out.println(str.substring(str.length()-2,str.length()).equals("ly"));
		
		System.out.println();
		System.out.println();
		
		
	//7-     Modify string removing 1st two and last two characters   using substring.
		
		String plane = "boeinff";
		
		if(plane.length()<=4)   //***ALWAYS add an if stmt for an exception for these kinds of problems.***
			plane="";           //the exception is the amount of characters changed(in this case 4 is removed) so at least 4 is needed.
		
		else 
		{	
		plane= plane.substring(2, plane.length()-2);
		System.out.print(plane);
		}
		
		
		

	}

}
