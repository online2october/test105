package automationpackage;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		//javascript executor
		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		
		//locate the element using javascript
		jsp.executeScript("document.getElementById('email').value='abc@gmail.com'" );
		jsp.executeScript("document.getElementById('pass').value='abcd@123'");
		
	   //scroll down using java script
		
		Thread.sleep(2000);
		jsp.executeScript("window.scrollBy(0,500)");
		
		//scroll up using java script
		
		Thread.sleep(2000);
		jsp.executeScript("window.scrollBy(0,-500)");
		
		//scroll right using java script
		
		Thread.sleep(2000);
		jsp.executeScript("window.scrollLeft +=500");

	}

}
