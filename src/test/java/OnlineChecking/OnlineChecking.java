package OnlineChecking;

import org.testng.annotations.Test;

public class OnlineChecking {
	
	@Test(priority=1,groups="smoke")
	public void checkInOnline_PNR_Number_Testcase1() {
		System.out.println("checkInOnline_PNR_Number_Testcase1()");
	}
	
	@Test(priority=2,groups={"smoke", "sanity"})
	public void checkInOnline_PNR_Number_Testcase2() {
		System.out.println("checkInOnline_PNR_Number_Testcase2()");
	}
	
	@Test(priority=3,groups={"smoke","sanity","regression"})
	public void checkInOnline_PNR_Number_Testcase3() {
		System.out.println("checkInOnline_PNR_Number_Testcase3()");
	}
	
	@Test(priority=4)
	public void checkInOnline_PNR_Number_Testcase4() {
		System.out.println("checkInOnline_PNR_Number_Testcase4()");
	}
	
	@Test(priority=5)
	public void checkInOnline_PNR_Number_Testcase5() {
		System.out.println("checkInOnline_PNR_Number_Testcase5()");
	}
	
	@Test(priority=6)
	public void checkInOnline_PNR_Number_Testcase6() {
		System.out.println("checkInOnline_PNR_Number_Testcase6()");
	}
}
