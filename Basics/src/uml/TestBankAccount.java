package uml;
//how i got this....
//right click project => new => JUNIT test case => give name and select class you want to test.

/*
 *  //Check that two objects are equal
      assertEquals(str1, str2);

      //Check that a condition is true
      assertTrue (val1 < val2);

      //Check that a condition is false
      assertFalse(val1 > val2);

      //Check that an object isn't null
      assertNotNull(str1);

      //Check that an object is null
      assertNull(str3);

      //Check if two object references point to the same object
      assertSame(str4,str5);

      //Check if two object references not point to the same object
      assertNotSame(str1,str3);

      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
 * 
 */


import static org.junit.Assert.*;

import org.junit.Test;

public class TestBankAccount {

	BankAccount acct= new BankAccount("Amit",3000);
	
	
	
	@Test
	public void testGetbalance() {
		
		
		assertTrue(acct.getbalance()==3000);
	}

	@Test
	public void testDeposit() {
		
	try {
		acct.deposit(200);
	} catch (BankAccountException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	assertTrue(acct.getbalance()==3200);
	
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

}
