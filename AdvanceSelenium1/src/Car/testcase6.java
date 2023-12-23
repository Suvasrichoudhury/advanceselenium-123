package Car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase6 {
	@Test
	public void lambrogini() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.audi.in/in/web/en.html");
	}

}
