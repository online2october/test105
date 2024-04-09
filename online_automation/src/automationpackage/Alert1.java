package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the URL
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//alert handling
		driver.findElement(By.id("confirmButton")).click();
		
		//verify alert text
		String  expalert = "Do you confirm action?";
		String alerttext = driver.switchTo().alert().getText();
		if(alerttext.equalsIgnoreCase(expalert))
		{
			System.out.println("alert varified ");
		}
		else {
			System.out.println("alert not verified");
		}
		//accept the alert
		driver.switchTo().alert().accept();
		System.out.println("alert accpeted");
		
		//dismiss the alert
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("alert is dismissed");
	}

}
