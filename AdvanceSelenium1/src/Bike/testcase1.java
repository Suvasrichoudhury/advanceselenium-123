package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1 {
	@Test(groups="smoke")
	public void avenger() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/bajaj-bikes/avenger/");

}
}