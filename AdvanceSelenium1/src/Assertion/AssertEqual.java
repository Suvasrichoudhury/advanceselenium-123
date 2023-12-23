package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual {
	@Test
	public void testcase() {
		String Expected="https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Expected, Actual);
		Reporter.log("testcase completed",true);
	}

}
