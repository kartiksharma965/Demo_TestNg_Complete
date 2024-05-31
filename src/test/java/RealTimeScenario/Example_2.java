package RealTimeScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/** Scenario : - How to set parallel thread count.
  Note = testng.xml file (testng_Parallel_testcase.xml).
  <suite name="Suite" parallel="methods" thread-count="2">
 * */

public class Example_2 {
	
	WebDriver driver;
	
	@Test
	public void testcase1() throws InterruptedException {
		System.out.println("Example_2 class I am inside testcase1() ="+Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		System.out.println("Example_2 class I am inside testcase2() ="+Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://yahoo.com");{
		Thread.sleep(3000);
		driver.quit();
		}
	}
}
