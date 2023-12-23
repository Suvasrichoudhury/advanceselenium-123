package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual {
	@Test
	public void TestCase() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String BeforeRegister = driver.findElement(By.linkText("Register")).getText();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("suvasri");
		driver.findElement(By.id("LastName")).sendKeys("choudhury");
		driver.findElement(By.id("Email")).sendKeys("choudhurysuva@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("suva1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("suva1234");
		driver.findElement(By.id("register-button")).click();
	     String Afterregister = driver.findElement(By.xpath("//a[.='choudhurysuva@gmail.com']")).getText();
	    Assert.assertNotEquals( BeforeRegister,Afterregister);
		
		
		
		
	}

}
