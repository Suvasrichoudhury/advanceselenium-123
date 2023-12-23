package SelenumBatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckLink {
@Test(priority=2)
public void openAmazon() {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test(priority=1)
public void openFlipkart() {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
}
}
