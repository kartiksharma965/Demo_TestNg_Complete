package RealTimeScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/** How to run test in multiple browser.*/
public class Example_5 {

	WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
	public void setUp(String browserName) {
		System.out.println("Browser name is :"+browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			driver=new InternetExplorerDriver();
		}
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Test is completed successfully");
	}
	
	@Test
	public void testcase1() {
		System.out.println("Example_5 class I am inside testcase1 ="+Thread.currentThread().getId());
		driver.get("https://google.com");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Example_5 class I am inside testcase1 ="+Thread.currentThread().getId());
		driver.get("https://yahoo.com");
	}
	
	@Test
	public void testcase3() {
		System.out.println("Example_5 class I am inside testcase3  ="+Thread.currentThread().getId());
		driver.get("https://rediff.com");
	}
	
}