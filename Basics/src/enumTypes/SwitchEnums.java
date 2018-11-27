package enumTypes;

public enum SwitchEnums {
	 STRAWBERRY, BANANA, APPLE, MANGO; 
	
	
	public static void main(String[]args) {
		
		SwitchEnums favorite=SwitchEnums.valueOf("STRAWBERRY");      //.valueOf  returns  Flavor.Strawberry   (converts String to enum type)
		//use this when receiving user Input. But don't forget to convert String to UPPER case 1st.
		
switch (favorite)

{
case STRAWBERRY:
System.out.print("yes");
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
	break;
}

		
	}
	
}
