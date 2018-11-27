package interfaces;

public class OrderedHourlyEmployee implements Ordered{

	
	int pay=30;
	
	
	//getter and setters
	public int getPay() {
		return pay;
	}
	
	public void setPay(int x) {
	this.pay=x;	
	}
	
	
	//interface method
	public boolean precedes(Object other) {
		
	if(other==null) 
		return false;
		
		else if(!  (other instanceof OrderedHourlyEmployee))
			return false;
					
			else {
				
			OrderedHourlyEmployee otherOrderedHourlyEmployee =(OrderedHourlyEmployee)other;
			return (getPay() < otherOrderedHourlyEmployee.getPay());
				
			}
	
	}
	
	
	//interface method
	public boolean follows(Object other)
	 {
		
	 if (other == null)
	 return false;
	 
	 
	 else if (!(other instanceof OrderedHourlyEmployee))
	 return false;
	 
	 
	 else
	 {
	 OrderedHourlyEmployee otherOrderedHourlyEmployee =  (OrderedHourlyEmployee)  other;
	 return (otherOrderedHourlyEmployee.precedes( this));
	 }
	 }
	
	
	
	
	
	
	}
	
	
	

