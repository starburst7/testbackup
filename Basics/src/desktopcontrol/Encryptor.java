package desktopcontrol;

public class Encryptor {

	public static void main(String[] args) {
	
		String text="";    //paste text here
		
		String temp2="";
		for (int i=0;i<=text.length()-1;i++)
		{
			temp2+=(char)(text.charAt(i)+3);
		}
		
		
		for (int i=0;i<=temp2.length()-1;i++)
		{
			text=(temp2.replace('w','!'));
		}

		

		
		System.out.print(text);
	}

}
