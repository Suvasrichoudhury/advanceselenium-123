package SelenumBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebshopUsingMethod {
	WebDriver driver;
	@Test
	public void acess() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
	
	}
	@Test
	public void register() {
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("gender-female")).click();
    driver.findElement(By.id("FirstName")).sendKeys("suva");
    driver.findElement(By.id("LastName")).sendKeys("choudhury");
    driver.findElement(By.id("Email")).sendKeys("choudhurysuva@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("suva1234");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("suva1234");
    driver.findElement(By.id("register-button")).click();
    
		
	}
	@Test(dependsOnMethods="register")
	public void login() {
		
		driver.findElement(By.linkText("Log in")).click();
	}
	@Test
	public void shoppingCart() {
		
		driver.findElement(By.linkText("Shopping cart")).click();
	}
	
}
	

