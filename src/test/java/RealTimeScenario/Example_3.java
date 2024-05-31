package RealTimeScenario;

import org.testng.annotations.Test;
/** Scenario = What happen when thread count is less than method count.
   <suite name="Suite" parallel="methods" thread-count="2">
   <test thread-count="2" name="Test">  // Important point as only 2 threads will be executed in parallel execution. 
  
   Output
   
   Example_3 class I am inside testcase1() =22
   Example_3 class I am inside testcase2() =23
   Example_3 class I am inside testcase3() =22
   
   Note = Observe testcase1() and testcase3() will share same thread i.e 22.
  */

public class Example_3 {
	
	
	@Test
	public void testcase1() {
		System.out.println("Example_3 class I am inside testcase1() ="+Thread.currentThread().getId());
	}
	
	@Test
	public void testcase2() {
		System.out.println("Example_3 class I am inside testcase2() ="+Thread.currentThread().getId());
	}
	
	@Test
	public void testcase3() {
		System.out.println("Example_3 class I am inside testcase3() ="+Thread.currentThread().getId());
	}

}
