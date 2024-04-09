package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception {
		
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the URL
		driver.get("https://www.facebook.com/");
		
		//To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//find the web element on web page
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("abcde");
		Thread.sleep(2000);
		
		//to click on login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		//to navigate to back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//again navigate to back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//to navigate forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//to refresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//to delete allcookies
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//to fetch the current URL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//to get the title of the page
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
