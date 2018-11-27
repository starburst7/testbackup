package desktopcontrol;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import java.io.InputStream;
import java.io.OutputStream;


public class ImageDownload {

	public static void main(String args[]) throws IOException  {
	
	String imageUrl="https://www.petakids.com/wp-content/uploads/2015/11/Cute-Red-Bunny.jpg";	 //downloads image in workspace.tools folder
	String destinationFile="image.jpg";
	
	saveImage(imageUrl,destinationFile);
		
	}
	
	
	public static void saveImage(String imageUrl,String destinationFile) throws IOException {    //note we could have used MalformedURLException
		
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
		
	}
	
	
}
