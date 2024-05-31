package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/** Fetching parameters from testng.xml file directly.
 */

public class Example_3 {
	
	@Parameters({"url","username","password"})
	@Test(priority=0,invocationCount=5)
	public void testcase_1(String  URL ,String USERNAME, String PASSWORD ) {
		System.out.println("***  ***");
		System.out.println("My url is = "+URL);
		System.out.println("My username is = "+USERNAME);
		System.out.println("My password is = "+PASSWORD);
	}

}
