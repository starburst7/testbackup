package arrayList;
                                
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayList_Basics {           
	
	
	  /*    1)  ArrayList cannot hold primitive data.  Must be Objects or interfaces ONLY!  (So use Wrappers!)
	   * 
	   * 
	   * 
	   *    2)  add method   **Increases size of array
	   *        -----------------
	   *        
	   *        - to set an empty element for the first time YOU MUST use add method. 
	   *        
	   *        BUT!!!!   => you can use add(index,value) to INSERT a value at an index position WITHOUT deleting what was there
	   *                      ...it will bump the rest.
	   *        
	   *         - You can .add(value)  to add at FIRST UNUSED position.
	   *         
	   *         
	   *         
	   *         
	   *       set method   **Does NOT change size
	   *      ---------------------
	   *      
	   *     - Used to change a value at a specified index. (Must not be empty).  It will NOT bump anything. only replace at index.   
	   * 





	   *    3)  PARTIALLY FILLED ARRAYLIST   **IMPORTANT**
	   *    
	   *    
	   *    if ArrayList size is 20.  and you filled index 0,1,2       
	   *    
	   *       -You cannot .add beyond index position==size   or last index used+1        
	   *    
	   *       -You cannot .set beyond index position==(size-1)  or last used index position.
	   *    
	   *    In both cases it will throw => IndexOutOfBoundsException (Unchecked)
	   * 
	   * 
*/
	public static void main(String[] args) {
	
		
		//ArrayList object of base type Integer objects with unknown initial size.
		ArrayList<Integer> objIntArray = new ArrayList<Integer> ();
		
		
// using .add and .set	
//--------------------------------------------------------------------------
		
		objIntArray.add(10);  //add to first unused position  =>index 0
		objIntArray.add(15);  //add to first unused position  =>index 1
		objIntArray.add(20);  //add to first unused position  =>index 2
//     10,15,20		
		
		objIntArray.add(2,17);  // add to index 2  and move what was there to index 3 and push everything forward.
//     10,15,17,20		
		
		objIntArray.add(25);   // add to first unused position => index 4
//      10,15,17,20,25 	
		
		
		objIntArray.set(1, 12);    //replace element at index 1.  But don't move anything.
		
		
		//Use for each to iterate ALL elements. ex: print all element's values
		for(Integer element: objIntArray)
			System.out.println(element);
	
		System.out.println();
		System.out.println();

		
		
		
		
		//SCENARIO 2:  Pre-determined size.
	    //------------------------------------
		
		ArrayList<Integer> objIntArray2 = new ArrayList<Integer> (20);		
		
		objIntArray2.add(10);  //add to first unused position  =>index 0
		objIntArray2.add(15);  //add to first unused position  =>index 1
		objIntArray2.add(20);  //add to first unused position  =>index 2
//     10,15,20
		
		
		
		//Example of improper use of .add in a partially filled array.
		//------------------------------------------------------------
		
		try {
		objIntArray2.add(6,30);	   // ** Throws IndexOutOfBoundsException ***  You cannot RESET beyond last UNUSED index. (index 3)
		}
		catch(IndexOutOfBoundsException e) {
			// I have placed this here so that I can continue the demonstration without errors displaying on console.
		}
		
		
		//Normal loop to iterate all elements.  (BETTER TO USE FOR EACH)
		for (int i=0;i<=objIntArray2.size()-1;i++)
			System.out.println(objIntArray2.get(i));
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		//.remove    Remove an element and shift all element positions by minus 1. (thus decrease size of array)
		//--------------------------------------------------------------------------
		
//      current elements of objIntArray => 10,12,17,20,25    size=5
		
		System.out.println("removing: "+objIntArray.remove(2));
		
//       result:   10,12,20,25		
		
		for (int i=0;i<=objIntArray.size()-1;i++)
			System.out.println(objIntArray.get(i));
		
		System.out.println("size decreased to: "+objIntArray.size());
		
	}

}
