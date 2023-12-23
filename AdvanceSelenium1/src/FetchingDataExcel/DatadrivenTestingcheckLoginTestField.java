package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DatadrivenTestingcheckLoginTestField {
	WebDriver driver;
    @BeforeClass
	public void setup() {
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.manage().window().maximize();
    	driver.get("https://demowebshop.tricentis.com/");
    }
	
	@DataProvider(name="Exceldata")
	public Object[][]data() throws IOException {
		//get data from excel
		FileInputStream ref=new FileInputStream("Exceldata/data4.xlsx");
		Workbook w= WorkbookFactory.create(ref);
		Sheet s=w.getSheet("sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		String[][]d=new String[rowsize-1][columnsize];
		for(int i=0;i<rowsize-1;i++) {
			for(int j=0;j<columnsize;j++) {
				d[i][j]=s.getRow(i+1).getCell(j).toString();
			}
		}
	return d;
	}
	@Test(dataProvider="Exceldata")
	public void loginTest(String user,String passw,String exp) {
		driver.get("https://demowebshop.tricentis.com/login");
	     driver.findElement(By.id("Email")).sendKeys(user);
		 driver.findElement(By.id("Password")).sendKeys(passw);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		String exp_title = "Dashboard/nopcommerce adminstration";//expected result
		String act_title = driver.getTitle();//actual result
		if(exp.equals("valid")) {
			if(exp_title.equals(act_title)) {
				driver.findElement(By.linkText("Log out")).click();
				Assert.assertTrue(true);//valid data login sucessfull it should pass
			}
			else {
				Assert.assertTrue(false);//invalid data login suceesful it should fail
			}
			}
		else if(exp.equals("invalid")) {
			if(exp_title.equals(act_title)) {
				driver.findElement(By.linkText("Log out")).click();
				Assert.assertTrue(false);//invalid data login sucessful means it should fail
			}
			else {
				Assert.assertTrue(true);//invalid  data login not sucessful it should pass
				
			}
			
		}
	}
	
	@AfterTest()
	public void close() {
		driver.close();
	}
		
		
	
		

}
