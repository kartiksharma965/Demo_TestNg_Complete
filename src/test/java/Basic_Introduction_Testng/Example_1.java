package Basic_Introduction_Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* All sequence of Testng annotation.
   
   STCM (@suite, @test, @class, @method)*/

public class Example_1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite annotation ('priority in execution is 1 one')");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite ('annotation')");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest annotation ('priority in execution is 2 two')");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest ('annotation')");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass annotation ('priority in execution is 3 three')");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass ('annotation')");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod annotation ('priority in execution is 4 four')");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod ('annotation')");
	}
	
	@Test
	public void testcase1() {
		System.out.println("testcase1 is first testcase");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testcase2 is second testcase");
	}
	
	@Test
	public void testcase3() {
		System.out.println("testcase3 is third testcase");
	}
}
