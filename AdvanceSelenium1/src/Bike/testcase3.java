package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase3 {
	@Test(groups="smoke")
	public void pulser() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/bajaj-bikes/pulsar/");
		
	}

}
