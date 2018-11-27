package classesAndmethods;


public class TestImmutable {

	
	
	public static void main(String[] args) {
	
		Mutable MutableObj = new Mutable();
		
		Immutable objImmutable = new Immutable(10,2.25,"hello",MutableObj);
		
		
		System.out.println("before the modification, the immutable held: "+ objImmutable.getTestObjField4().getNum());
		MutableObj.setNum(5);  //immutable object's 4th field is an object with it's own field called Num.
							   //  this num field is changed.  Thus an attempt is made to modify the immutable obj
		

		System.out.println("after the modification, the immutable still holds :"+ objImmutable.getTestObjField4().getNum());

	}

}
