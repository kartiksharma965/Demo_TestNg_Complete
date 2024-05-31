package Basic_Introduction_Testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** TestNg_Dependence
    TestNg_Enable
    TestNg_DependsOnMethods 
    */

public class Example_4 {

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
	
 // Rule=> If enabled for any testcase is false then as result required testcase (test1()) will not be executed.
    @Test(priority=1,enabled=true)
    public void testCase1() {
    	System.out.println("testCase1() is first testcase");
    }
    
 // Rule=> by default below testcase(test2()) execution is true.
    @Test(priority=2)
    public void testCase2() {
    	System.out.println("testCase2() is two testcase");
    }
    
 // Rule=> explicitly we are specifying enabled as true
    @Test(priority=3, enabled=true)
    public void testCase3() {
    	Assert.assertEquals(12, 13);
    	System.out.println("testCase3() is three testcase");
    }
    
  /*Rule=> test4() is dependent on method test2(). so first test2() will execute after  that test4().
   note=> In case testCase1() is failing then test4() will be ignored or not executed.
   */
    @Test(dependsOnMethods="testCase1")
    public void testCase4() {
    	System.out.println("testCase4() is four testcase");
    }
    
    @Test(dependsOnMethods="testCase2")
    public void testCase5() {
    	System.out.println("testCase5() is five testcase");
    }
    
    @Test(dependsOnMethods= {"testCase1","testCase2","testCase3"})
    public void testCase6() {
    	System.out.println("testCase6() is six testcase");
    }

}
