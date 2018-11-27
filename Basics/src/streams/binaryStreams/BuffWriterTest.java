package streams.binaryStreams;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffWriterTest {

	public static void main(String[] args) {
		
		
		BufferedWriter out=null;
		
		try {
			out= new BufferedWriter(new FileWriter("data.txt"));
			
			
			out.write("he");
		}
		
		catch(IOException e) {
			
		}
		
		

	}

}
