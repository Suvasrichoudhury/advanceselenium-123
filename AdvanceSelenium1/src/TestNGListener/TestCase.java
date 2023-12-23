package TestNGListener;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplimentation.class)
public class TestCase {
	@Test
	public void testcase() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("choudhurysuva@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("suva1234");
		 driver.findElement(By.cssSelector("[value='Log in']")).click();
		 driver.findElement(By.linkText("Log out")).click();
	}

}
