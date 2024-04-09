package automationpackage;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulation2 {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the URL
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//switch to frame
		driver.switchTo().frame(0);
		System.out.println("switch to frame");
		
		//draggable webelement
		WebElement dragg =driver.findElement(By.id("draggable"));
		//droppable webelement
		WebElement dropp =driver.findElement(By.id("droppable"));
		
		//drag and drop using action functions
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(dragg, dropp).build().perform();
		System.out.println("drag and drop done");
		
		

	}

}
