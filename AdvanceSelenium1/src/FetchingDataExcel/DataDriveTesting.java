package FetchingDataExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriveTesting {
	@DataProvider(name="Exceldata")
		public Object[][]data(){
			Object[][]d=new Object[2][2];
			d[0][0]="username1";
			d[0][1]="password";
			d[1][0]="username2";
			d[1][1]="password";
			
			return d;
		}
	@Test(dataProvider="Exceldata")
	public void m1(String user,String passw) {
		System.out.println(user);
		System.out.println(passw);

	}

}
