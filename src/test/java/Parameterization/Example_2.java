package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_2 {

	@Test(priority=0, dataProvider="myParameterizedData", invocationCount=5)
	public void testCase_1(String USERNAME, String PASSWORD, String EMPLOYEE, String COMPANY) {
		System.out.println("*** ***");
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(EMPLOYEE);
		System.out.println(COMPANY);
	}
	
	
	
	
	@DataProvider(name="myParameterizedData")
	public Object [] [] myDataProvider(){
		
		Object [] [] obj= new Object [3] [4];
		
		obj[0] [0] = "username_1";
		obj[0] [1] = "password_1";
		obj[0] [2] = "employee_1";
		obj[0] [3] = "company_1";
		
		obj[1] [0]  = "username_2";
		obj[1] [1]  = "password_2";
		obj[1] [2]  = "employee_2";
		obj[1] [3]  = "company_2";
		
		obj[2] [0]  = "username_3";
		obj[2] [1]  = "password_3";
		obj[2] [2]  = "employee_3";
		obj[2] [3]  = "company_3";
		
		return obj;
	}
}
