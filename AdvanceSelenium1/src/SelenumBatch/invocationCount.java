package SelenumBatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationCount {
	//to execute testcase again and again
	//instead of for loop we use invocationCount
	@Test(priority=2,invocationCount=2)
	public void login() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	//if we want enabled this method means it will not run
	@Test(priority=3,enabled=false)
	public void register() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test(priority=1)
	public void logout() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}

}
