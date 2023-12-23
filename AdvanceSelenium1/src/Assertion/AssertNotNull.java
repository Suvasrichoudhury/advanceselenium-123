package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
	
		@Test
		public void testcase() {

		ChromeDriver driver=new ChromeDriver();
	   Assert.assertNotNull(10);
	}
	}


