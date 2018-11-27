package decimalFormat;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class UsingDecimalFormat {

	public static void main(String[] args) {
	
		double digits=12.5895;
		
		// 12.5895 =>  12.59
		DecimalFormat obj= new DecimalFormat("00.00");   //initialize pattern with constructor
		
		
		obj.setRoundingMode(RoundingMode.UP);          //Make sure RoundingMode is correct.   ex:  .DOWN  .CEILING  .FLOOR  .HALF_DOWN
		System.out.println(obj.format(digits));											//      .HALF_UP   .UP   .HALF_EVEN
		
		
		// 12.5895  =>  012.58950 
		obj.applyPattern("000.00000");                //change pattern that was set previously.
		System.out.println(obj.format(digits));
	}

}
