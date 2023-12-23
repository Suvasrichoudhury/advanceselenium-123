package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
	public class AssertTrue {
		@Test
		public void testcase() {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			 boolean radio = driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isDisplayed();
			 Assert.assertFalse(radio);

          }
	}
}
	
