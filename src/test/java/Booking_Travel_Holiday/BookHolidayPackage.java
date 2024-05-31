package Booking_Travel_Holiday;

import org.testng.annotations.Test;

public class BookHolidayPackage {
	
	// Rule = In xml config if we specify "smoke" then testcase1(), testcase2() and testcase3() will only be executed.
	
	@Test(priority=0, groups="smoke")
	public void bookHolidayPackage_destination_testcase1() {
		System.out.println("bookHolidayPackage_destination_testcase1()");
	}
	
	@Test(priority=1,groups={"smoke", "sanity"})
	public void bookHolidayPackage_departure_testcase2() {
		System.out.println("bookHolidayPackage_departure_testcase2()");
	}
	
	@Test(priority=2,groups= {"smoke","sanity","regression"})
	public void bookHolidayPackage_return_testcase3() {
		System.out.println("bookHolidayPackage_return_testcase3()");
	}
	
	@Test(priority=3)
	public void bookHolidayPackage_sitesceen_testcase4() {
		System.out.println("bookHolidayPackage_sitesceen_testcase4()");
	}
	
	@Test(priority=4)
	public void bookHolidayPackage_travel_testcase5() {
		System.out.println("bookHolidayPackage_travel_testcase5()");
	}
	
	@Test(priority=5)
	public void bookHolidayPackage_remote_testcase6() {
		System.out.println("bookHolidayPackage_remote_testcase6()");
	}

}
