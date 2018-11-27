package recursive.stringPermutations;


public class StringPermutations {

	
	public static void permute(String str, int l, int r) {
		
		
		if (l ==r)
			System.out.println(str);
		
		else {
			
			for (int i=l ; i<= r; i++) {  
				
				str = swap(str, l, i) ;
				
				permute(str, l+1 , r);     //recursion
				
				str = swap( str, l , i);
				
			}
			
		}
			
		
	}

		
		
	
	//Swap two characters                                        //stores word into a character array in order to swap easily.
	public static String swap(String word, int i, int j) {
	
		char[] wordCharacters=word.toCharArray();
		
		char temp=word.charAt(i);
		
		wordCharacters[i]=word.charAt(j);
		wordCharacters[j]=temp;
		
		return String.valueOf(wordCharacters);
	}
	
	
	public static void main(String[] args) {
	
		String word="COIN";
		
permute(word, 0, word.length()-1);       //give all possible permutations for given String


		
	}

}
