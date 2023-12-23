package SelenumBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test(dependsOnMethods="register")
	public void login() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=3)
	public void logout() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	@Test(priority=1)
	public void register() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Registerlik")).click();
	}

}
