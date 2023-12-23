package Car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase5 {
	@Test(dependsOnGroups="smoke")
	public void audi() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.audi.in/in/web/en.html");
		
	}

}
