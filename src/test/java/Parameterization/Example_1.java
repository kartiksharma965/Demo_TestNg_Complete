package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_1 {
	
	@Test(dataProvider="myData_Parameterization")
	public void testcase1(String username, String password) {
		System.out.println("*** ***");
		System.out.println(username);
		System.out.println(password);
		
		/** Rule= Never provide values in " " (double comma).
		    Since at runtime static value is displayed at runtime.
		    
		 System.out.println("username");
		 System.out.println("password");
		 */
	}
	
	@DataProvider(name="myData_Parameterization")
	public Object[] [] myDataProvider(){
		Object[] [] obj= new Object [6] [2];
		
		obj[0] [0] = "UserName_1";
		obj[0] [1] = "Password_1";
		
		obj[1] [0] = "UserName_2";
		obj[1] [1] = "Password_2";
		
		obj[2] [0] = "UserName_3";
		obj[2] [1] = "Password_3";
		
		obj[3] [0] = "UserName_4";
		obj[3] [1] = "Password_4";
		
		obj[4] [0] = "UserName_5";
		obj[4] [1] = "Password_5";
		
		obj[5] [0] = "UserName_6";
		obj[5] [1] = "Password_6";
		
		return obj;
	}

}
