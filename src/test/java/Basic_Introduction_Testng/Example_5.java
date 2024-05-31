package Basic_Introduction_Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** Scenario : If we need to execute our testcase multiple number of time.
              We use invocationCount annotation. */

public class Example_5 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass annotation ('priority in execution is 1 one')");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass ('annotation')");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod annotation ('priority in execution is 2 two')");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod ('annotation')");
	}
	
	// below mentioned testcase will be execute 5 times.
	@Test(priority=0, invocationCount=5)
	public void testcase_1() {
		System.out.println("username");
		System.out.println("password");
	}
}
