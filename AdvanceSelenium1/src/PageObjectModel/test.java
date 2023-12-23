package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {
	@Test
	public void testCase() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Welcomepage w= new Welcomepage(driver);
		w.getRegisterlink().click();
		RegisterPage r=new RegisterPage(driver);
		r.getGender().click();
		r.getFirstname().sendKeys("suva");
		r.getLastname().sendKeys("choudhury");
		r.getEmail().sendKeys("choudhurysuva@gmail.com");
		r.getPassword().sendKeys("suva1234");
		r.getConfirmpassword().sendKeys("suva1234");
		r.getRegisterbutton().click();
		
		Loginpage l=new Loginpage(driver);
		l.getLogin().click();
		l.getEmailid().sendKeys("choudhurysuva@gmail.com");
		
		l.getPassword().sendKeys("suva1234");
		l.getLoginbutton().click();
		/*@DataProvider(name="Exceldata")
		public Object[][]data() throws IOException {
			get data from excel
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
		return d;*/
		
		
		
		
	}

}
