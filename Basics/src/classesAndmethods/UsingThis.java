package classesAndmethods;

			// .this  is used when fields and parameters have the same names. 
//.this  clarifies that it is refering to the fields OF THE OBJECT that is calling the method.

public class UsingThis {

	static int z=33;   //static field
	
	private int hour=1;   //instance variable fields
	private int min=2;
	private int sec=3;
	
	
	public static void main(String[] args) {
		
		
UsingThis obj = new UsingThis();

System.out.println(obj.hour+ " "+obj.min+" "+obj.sec+" "+UsingThis.z);

obj.setTime(4, 5, 7,9);
System.out.println(obj.hour+ " "+obj.min+" "+obj.sec+" "+UsingThis.z);



UsingThis obj2 = new UsingThis();
System.out.println(obj2.hour+ " "+obj2.min+" "+obj2.sec+" "+UsingThis.z);
	}
	
	
	//note objects will always be initiated to original fields. The method will modify it after the fact(when it is invoked).
	public void setTime (int hour, int min, int sec,int z) {
	
		this.hour=hour;    //so .this refers to the FIELDS OF THE CURRENT OBJECT that is calling the method. (it is used when it shares similar name as parameters of method)
		this.min=min;
		this.sec=sec;     
		UsingThis.z=z;   
	}

}
