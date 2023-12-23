package SelenumBatch;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginApp {

	@Test(priority=1)
	public void login() {
		Reporter.log("pass",true);
	}
	@Test(priority=2)
	public void register()
	{
		Reporter.log("pass1",true);
	}
	@Test(priority=3)
	public void logout() {
		Reporter.log("pass2",true);
		
	
	
	
	}	
}
