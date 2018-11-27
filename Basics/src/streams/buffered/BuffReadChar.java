package streams.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffReadChar {

	public static void main(String[] args) {
	
		
BufferedReader inputStream =null;

				//read single line from txt
//			----------------------------------------------
try {                                       //can also use UNIX convention:  C:/Users/2flare/Desktop/streams.txt
inputStream= new BufferedReader(new FileReader("strea.txt"));

String line = inputStream.readLine();

System.out.print(line);


}

catch(FileNotFoundException e) {
	System.exit(0);
}

catch(IOException e) {
	
}

System.out.print("Test");
System.out.println();
		
	}

}
