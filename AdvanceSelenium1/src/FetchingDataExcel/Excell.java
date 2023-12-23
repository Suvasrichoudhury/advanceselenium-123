package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Exceldata/data.xlsx");
       Workbook xlsx=WorkbookFactory.create(fis);
       String data = xlsx.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
       System.out.println(data);
	}

}
