package Basic_Introduction_Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_2 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest annotation ('priority in execution is 1 one')");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest ('annotatio')");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod annotation ('priority in execution is 2 two')");
	}
	
	
	public void afterMethod() {
		System.out.println("@AfterMethod ('annotation')");
	}
	
	@Test
	public void testcase1() {
		System.out.println("testcase1() is the first testcase");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testcase2() is the second testcase");
	}
	
	@Test
	public void testcase3() {
		System.out.println("testcase3() is the third testcase");
	}

}
