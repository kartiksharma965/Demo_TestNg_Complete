package Booking_Travel_Holiday;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookFlight {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod is execute before every testcase");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod is executed after every testcase");
	}
	
	// Rule = In xml config if we specify "smoke" then testcase1(), testcase2() ,testcase4() and testcase5() will only be executed.
	@Test(priority=0,groups="smoke")
	public void bookFlight_RoundTrip_TestCase1() {
		System.out.println("bookFlight_RoundTrip_TestCase1()");
	}
	
	@Test(priority=1,groups= {"smoke","sanity","regression"})
	public void bookFlight_RoundTrip_TestCase2() {
		System.out.println("bookFlight_RoundTrip_TestCase2()");
	}
	
	@Test(priority=2)
	public void bookFlight_RoundTrip_TestCase3() {
		System.out.println("bookFlight_RoundTrip_TestCase3()");
	}
	
	@Test(priority=3,groups="smoke")
	public void bookFlight_OneWayTrip_TestCase4() {
		System.out.println("bookFlight_OneWayTrip_TestCase4()");
	}

	@Test(priority=4,groups={"smoke","sanity","regression"})
	public void bookFlight_OneWayTrip_TestCase5() {
		System.out.println("bookFlight_OneWayTrip_TestCase5()");
	}
	
	@Test(priority=5)
	public void bookFlight_OneWayTrip_TestCase6() {
		System.out.println("bookFlight_OneWayTrip_TestCase6()");
	}
}
