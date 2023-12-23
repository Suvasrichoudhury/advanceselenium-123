package FetchingDataExcel;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demoshoploginDatadriven {
WebDriver driver;
@Test(priority=1)
public void acessBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
public void loginTest(String email,String password) {

	driver.get("https://demowebshop.tricentis.com/login");
     driver.findElement(By.id("Email")).sendKeys(email);
	 driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.cssSelector("[value='Log in']")).click();
	driver.findElement(By.linkText("Log out")).click();
}
}
