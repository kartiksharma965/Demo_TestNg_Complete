package Basic_Introduction_Testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** 
 * Testng priority :- It is sequence in which we need to execute our testcases (0>1>2>3>4>5).
 */

public class Example_3 {

	@BeforeClass()
	public void beforeClass() {
		System.out.println("@BeforeClass() annotation ('prioirty in execution is 1 one')");
	}
	
	@AfterClass()
	public void afterClass() {
		System.out.println("@AfterClass() ('annotation')");
	}
	
	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("@BeforeMethod() annotation ('priority in execution is 2 two')");
	}
	
	@AfterMethod()
	public void afterMethod() {
		System.out.println("@AfterMethod() ('annotation')");
	}
	
	@Test(priority=6)
	public void testCase1() {
		System.out.println("testCase1() is	 first testcase");
	}
	
	@Test(priority=5)
	public void testCase2() {
		System.out.println("testCase2() is second testcase");
	}
	
	@Test(priority=4)
	public void testCase3() {
		System.out.println("testCase3() is third testcase");
	}
	
	@Test(priority=3)
	public void testCase4() {
		System.out.println("testCase4() is four testcase");
	}
	
	@Test(priority=2)
	public void testCase5() {
		System.out.println("testCase5() is five testcase");
	}
	
	@Test(priority=1)
	public void testCase6() {
		Assert.assertEquals(12, 11);
		System.out.println("testCase6() is six testcase");
	}
}
