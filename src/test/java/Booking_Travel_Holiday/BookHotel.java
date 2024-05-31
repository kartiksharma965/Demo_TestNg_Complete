package Booking_Travel_Holiday;

import org.testng.annotations.Test;

public class BookHotel {
	
	@Test(priority=0, groups="smoke")
	public void bookHotle_DestinationCity_Testcase1() {
		System.out.println("bookHotle_DestinationCity_Testcase1()");
	}
	
	@Test(priority=1, groups={"smoke", "sanity"})
	public void bookHotle_checkIn_Testcase2() {
		System.out.println("bookHotle_checkIn_Testcase2()");
	}
	
	@Test(priority=2, groups= {"smoke","sanity","regression"})
	public void bookHotle_checkOut_Testcase3() {
		System.out.println("bookHotle_checkOut_Testcase3()");
	}

}
