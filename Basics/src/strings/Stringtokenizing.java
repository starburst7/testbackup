package strings;

import java.util.StringTokenizer;


public class Stringtokenizing {

	public static void main(String[] args) {
		
		
		StringTokenizer tokenizer = new StringTokenizer("hello my name is amit");
		
		
		
		while (tokenizer.hasMoreTokens()==true)
		System.out.println(tokenizer.nextToken());
		
		
		
		
		
		}
	
	


	}

