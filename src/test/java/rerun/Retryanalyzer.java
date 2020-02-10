package rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyzer implements IRetryAnalyzer {
		int count=0;
		int limit=2;
		
	public boolean retry(ITestResult arg0) {
		if(count<=limit) {
			count++;
			return true;
			
		}
		return false;
	}

}
