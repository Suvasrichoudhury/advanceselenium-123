package SelenumBatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class prop {

	public static void main(String[] args) throws IOException {
		FileInputStream f= new FileInputStream("Data2/data.properties");
		Properties p=new Properties();
		p.load(f);
		String url = p.getProperty("url");
		System.out.println(url);

	}

}
