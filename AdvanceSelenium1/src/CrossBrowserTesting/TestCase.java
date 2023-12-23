package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {
	@Test
	public void testcase() {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("choudhurysuva@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("suva1234");
		 driver.findElement(By.cssSelector("[value='Log in']")).click();
		 driver.findElement(By.linkText("Log out")).click();
		
	}

}
