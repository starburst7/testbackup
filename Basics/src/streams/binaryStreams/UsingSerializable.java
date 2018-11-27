package streams.binaryStreams;

import java.io.Serializable;

import streams.UsingFile;

           //NOTE :   -Objects must be serializable in order to be outputted in binary
		//			   -Any FIELD OBJECTS of class MUST be serializable as well or the class itself cannot be Serializable

		//             -note when an object is retrieved from a binary file. It has only instance variables(no methods)
			//          However, when it is casted, it regains its methods.

			//         -An array can be written in binary as long its elements are serializable objects only.




public class UsingSerializable implements Serializable{

	
	public int x=3003;
	
	public int y=220;
	
	
	public void notRetrieved() {

		
		System.out.print("serializing a class , you lose its methods but regain when casting");
		
}
	
}
