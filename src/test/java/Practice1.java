import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 {

	@Test
	public void method1() throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./CommonProperty.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String URL = p.getProperty("url");
		System.out.println(URL);
		System.out.println("printing the url");
		
		driver.get(URL);		
	}
}
