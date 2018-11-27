package streams.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffReadbyLine {

	public static void main(String[] args) {
	
		
BufferedReader inputStream =null;

				//read single line from txt
//			----------------------------------------------
try {                                       //can also use UNIX convention:  C:/Users/2flare/Desktop/streams.txt
inputStream= new BufferedReader(new FileReader("streams.txt"));


String line = inputStream.readLine();

System.out.print(line);


//if the text was connected successfully and the readline worked. Then no exception was thrown.
//  code continues here. We close the stream it is no longer needed.
inputStream.close();

}


catch(FileNotFoundException e) {
	
	System.out.print(e.getMessage());
	System.exit(0);           //note: stream was never opened so no need close()
}



catch(IOException e) {
System.out.print("error reading line");
}





	}

}
