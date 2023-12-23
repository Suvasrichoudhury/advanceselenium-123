package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
	@Test
	public void testcase() {

	ChromeDriver driver=new ChromeDriver();
   Assert.assertNull(10);
}
}