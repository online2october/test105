package automationpackage;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulation1 {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome driver and passing chromedriver path
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//open the URL
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);
				
				
				//create webelement reference for electronic
				WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
				//mouse simulation by action class
				Actions act =new Actions(driver);
				//mouse hover to electronics
				Thread.sleep(2000);
				act.moveToElement(electro).build().perform();
				
				//keyboard operations
				Thread.sleep(2000);
				driver.navigate().refresh();
				WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
				Thread.sleep(2000);
				act.sendKeys(fash,Keys.ENTER).build().perform();
				System.out.println("fashion is clicked");
				
				//right click on webpage
				Thread.sleep(2000);
				act.contextClick().build().perform();
	}

}
