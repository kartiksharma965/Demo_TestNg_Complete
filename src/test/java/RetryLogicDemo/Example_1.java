package RetryLogicDemo;
import org.testng.Assert;
import org.testng.annotations.Test;
/** Scenario : We are deliberately failing 2 tescase() and passing 1 testcase().
 *             we will try to re run test failed testcases.
 * 
 * @author kkumar97
 *
 */
public class Example_1 {

	@Test()
	public void testcase1() {
		System.out.println("testcase1");
		Assert.assertTrue(false);	
	}
	
	@Test()
	public void testcase2() {
		System.out.println("testcase2");
		Assert.assertTrue(false);
	}
	
	@Test()
	public void testcase3() {
		System.out.println("testcase3()");
		Assert.assertTrue(true);
	}}
