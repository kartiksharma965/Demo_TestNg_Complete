package RealTimeScenario;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.annotations.Test;

/** Scenario :- How to run test in Parallel 
  Note = testng.xml file (testng_Parallel_testcase.xml).
  <suite name="Suite" parallel="methods" thread-count="2">
 * */
public class Example_1 {

	@Test
	public void testCase1() {
		System.out.println("*** Start testcase1() ***");
		System.out.println("Example_1 class I am inside testcase1() ="+ Thread.currentThread().getId());
	}
	
	@Test
	public void testcase2() {
		System.out.println("*** Start testcase2() ***");
		System.out.println("Example_1 class I am inside testcase2() ="+Thread.currentThread().getId());
	}
}
