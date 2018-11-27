package algorithms;

public class PasswordBruteForce {
	

	public static void main(String args[])
	
	{
		
		String password="be36c";
		String input;
		int counter=0;
		long startTime=System.currentTimeMillis();
		
	
//brute force checker algorithm   loops from a to z for:  74^6 combinations possible for 6 character password.
	for (int i=48;i<=122;i++)  //from '0' which is 48 in unicode  to    'z' is 122 in unicode
	for (int j=48;j<=122;j++)
	for (int d=48;d<=122;d++)
		for (int e=48;e<=122;e++)	
			for (int f=48;f<=122;f++)
				
					
						
	{
	input=		Character.toString((char)(i))+   Character.toString((char)(j)) + Character.toString((char)(d))+ Character.toString((char)(e))
				+Character.toString((char)(f));
	
	
	counter++;
	

	
		
		
		
	//results. 
	if(input.equals(password))
	{
		
		long endTime=System.currentTimeMillis();
		double runningTime=(endTime-startTime)/1000;
		System.out.println("The password is: "+input+" and it took "+runningTime+ " seconds and " +counter+" number of brute force attempts");
		
		double average=(counter/runningTime)/1000000;
		System.out.println("At an average of "+(average)+" million attempts per second");
		break;
	}
	

	
	
	}
	
		
	
	}

	

}
