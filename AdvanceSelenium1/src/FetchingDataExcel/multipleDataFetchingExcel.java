package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multipleDataFetchingExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream ref=new FileInputStream("Exceldata/data1.xlsx");
		Workbook w= WorkbookFactory.create(ref);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				String data1 = w.getSheet("sheet1").getRow(i).getCell(j).toString();
				System.out.print(data1+" ");
			}
			System.out.println();
		}

	}

}
