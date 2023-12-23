package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void ConnectServer() {
		Reporter.log("Connecting to the server",true);
		}
	@BeforeTest
	public void ConnectDatabase(){
	Reporter.log("Connecting to the database",true);
		}
	WebDriver driver=new ChromeDriver();
	@BeforeClass
	public void open() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("open the browser",true);
        }
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("suva@1234");
		driver.findElement(By.id("Password")).sendKeys("suva12");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		Reporter.log("login to the browser",true);
	}
	@AfterMethod
	public void logout() {
	
		Reporter.log("logout to the browser ",true);
	}
	@AfterClass
	public void close() {
		Reporter.log("close the browser ",true);
		
	}
	@AfterTest
	public void diconnectDatabase() {
		Reporter.log("disconnecting to the database",true);
		
	}
	@AfterSuite
	public void disconnectServer() {
		Reporter.log("disconnecting to the server",true);
	}
	
}
