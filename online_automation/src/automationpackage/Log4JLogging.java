package automationpackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {
		
		//create instance og logger
		
		Logger logger = Logger.getLogger("Log4JLogging");
		
		//configure log4j properties
		PropertyConfigurator.configure("C:\\Users\\vibhu\\Downloads\\eclipse-java-2023-09-R-win32-x86_64\\eclipse\\online_automation\\log4j.properties");
		
		//open browser instance
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		logger.info("chrome browser instance opened");
		
		//maximze the windows
		driver.manage().window().maximize();
		logger.info("window miximize");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("implicit wait given");
		
		//check if the webelement displayed or not
		try {
			driver.findElement(By.id("email")).isDisplayed();
			logger.info("web element found");
		}catch (Exception e){
			logger.info("web element not found");
				
				
			}
		
		
	}

}
