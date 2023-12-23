package Car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase4 {
	@Test(groups="smoke")
	public void bmw() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bmw.in/en/all-models.html");
		
	}

}
