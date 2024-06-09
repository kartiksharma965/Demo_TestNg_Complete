package RetryLogicDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	// Counter to keep track of retry attempts.
	int counterForRetryAttemps = 0;

	// Set maximum limit for retry.
	int setMaxLimitForRetry = 3; 
	
	
	// Method to retry failed testcase.
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub
		if(!result.isSuccess()) {
			
			if(counterForRetryAttemps < setMaxLimitForRetry )
			{
				counterForRetryAttemps++;
				return true;
			}
		}
		return false;
	}
}
