package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.codec.language.ColognePhonetic;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class countRowColumn {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Exceldata/data3.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		Sheet s=w.getSheet("sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowsize);
		System.out.println(columnsize);
		
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				String data3 = w.getSheet("sheet1").getRow(i).getCell(j).toString();
				System.out.println(data3);
			}
		}
		
	}
}
	
