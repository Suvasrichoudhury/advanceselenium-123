package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void testcase() {
		String Expected = "https://www.amazon.in/";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String Actual = driver.getCurrentUrl();
		org.testng.asserts.SoftAssert s=new org.testng.asserts.SoftAssert();
		s.assertEquals(Expected, Actual);
		Reporter.log("testcase completed",true);
		s.assertAll();
	}

}
