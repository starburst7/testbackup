package enumTypes;

enum Flavor  { STRAWBERRY, BANANA, APPLE, MANGO };

public class SwitchEnum {

	
	public static void main(String[]args) {
		
		
		
		Flavor favorite=Flavor.valueOf("STRAWBERRY");      //.valueOf  returns  Flavor.Strawberry   (converts String to enum type)
															//use this when receiving user Input. But don't forget to convert String to UPPER case 1st.
		switch (favorite)
		
		{
		case STRAWBERRY:
			//c1
			break;
		case BANANA:
		//c2
			break;
		case APPLE:
			//c3
			break;
		case MANGO:
			//c4
			break;
			
		default:	
		
		
		}
		
		
		
		
		
	
	
}

	
	
}


