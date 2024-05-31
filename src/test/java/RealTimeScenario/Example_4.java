package RealTimeScenario;

import org.testng.annotations.Test;
/** How to configure a single method to run in multiple thread. 
  
   Scenario : testcase1() will executed 3 times in 3 different threads.
   since threadPoolSize=3. It will be executed 3 times as invocationCount is also provided.
   Output
   Example_4 class I am inside testcase1() =27
   Example_4 class I am inside testcase1() =25
   Example_4 class I am inside testcase1() =26
 * */

public class Example_4 {
	// threadPoolSize is defined as 3. So testcase1() will be executed in 3 three different thread.
	@Test(threadPoolSize=3, invocationCount =3, timeOut=2000)
	public void testcase1() {
		System.out.println("Example_4 class I am inside testcase1() ="+Thread.currentThread().getId());
	}
	
	@Test
	public void testcase2() {
		System.out.println("Example_4 class I am inside testcase2() ="+Thread.currentThread().getId());
	}

	@Test
	public void testcase3() {
		System.out.println("Example_4 class I am inside testcase3() ="+Thread.currentThread().getId());
	}
}
