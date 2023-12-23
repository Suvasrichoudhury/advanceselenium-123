package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeOuts {
	@Test(timeOut =10000)
	public void open() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
