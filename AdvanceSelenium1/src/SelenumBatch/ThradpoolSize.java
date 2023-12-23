package SelenumBatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThradpoolSize {
	@Test(priority=2,invocationCount=2,threadPoolSize=3)
	public void login() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
}
