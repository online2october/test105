package automationpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
	
		//specify the loaction of properties file
		File src1=new File("C:\\Users\\vibhu\\Downloads\\eclipse-java-2023-09-R-win32-x86_64\\eclipse\\online_automation\\Repository\\config.properties");
		
		File src2=new File("C:\\Users\\vibhu\\Downloads\\eclipse-java-2023-09-R-win32-x86_64\\eclipse\\online_automation\\Repository\\locators.properties");
		
		File src3=new File("C:\\Users\\vibhu\\Downloads\\eclipse-java-2023-09-R-win32-x86_64\\eclipse\\online_automation\\Repository\\testdata.properties");
		
		//create file input stream class object to load the file
		
		FileInputStream fis1 = new FileInputStream(src1);
		FileInputStream fis2 = new FileInputStream(src2);
		FileInputStream fis3 = new FileInputStream(src3);
 
		//create properties class object to read properties class object
		
		Properties pro1=new Properties();
		pro1.load(fis1);
		
		Properties pro2=new Properties();
		pro2.load(fis2);
		
		Properties pro3=new Properties();
		pro3.load(fis3);
		
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open the URL
		driver.get(pro1.getProperty("URL"));
		
		//get property method will accept key and return its value
		
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("Testdata1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("Testdata2"));
		Thread.sleep(2000);
		driver.close();
		
	}

}
