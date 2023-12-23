package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class usingLoopDataDriveTesting {
	@DataProvider(name="Exceldata")
	public Object[][]data() throws IOException {
		
		FileInputStream ref=new FileInputStream("Exceldata/data1.xlsx");
		Workbook w= WorkbookFactory.create(ref);
		Sheet s=w.getSheet("sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		Object[][]d=new Object[rowsize][columnsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
	}
	@Test(dataProvider="Exceldata")
	public void m1(String user,String passw) {
		
		
	
		
	}

}
