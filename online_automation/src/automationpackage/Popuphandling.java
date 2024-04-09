package automationpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandling {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome driver and passing chromedriver path
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//open the URL
				driver.get("https://demoqa.com/browser-windows");
				driver.manage().window().maximize();
				
				
				//tab handling
				Thread.sleep(2000);
				driver.findElement(By.id("tabButton")).click();
				
				//get total no of windows open
				Set<String> allopenwindows = driver.getWindowHandles();
				System.out.println(allopenwindows);
				Iterator<String> abc = allopenwindows.iterator();
				String win1 = abc.next();
				String win2 = abc.next();
				
				//print the title of parent window
				driver.switchTo().window(win1);
				System.out.println("parent window id :"+win1);
				System.out.println(driver.getTitle());
				
				//print the url of child window
				Thread.sleep(2000);
			   driver.switchTo().window(win2);
			   Thread.sleep(2000);
			   System.out.println("child window id :" +win2);
			   System.out.println(driver.getCurrentUrl());
			   driver.close();
			   
			   //window popup handling
			   Thread.sleep(2000);
			   driver.switchTo().window(win1);
			   Thread.sleep(2000);
			   driver.findElement(By.id("windowButton")).click();
			   
			   //print the title of child window
			   Set<String> allopenwindows1 = driver.getWindowHandles();
				System.out.println(allopenwindows1);
				Iterator<String> abc1 = allopenwindows1.iterator();
				String win3 = abc1.next();
				String win4 = abc1.next();
				Thread.sleep(2000);
				driver.switchTo().window(win4);
				System.out.println("child window id: "+win4);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.quit();
				System.out.println("window and popups handled");
			   

	}

}
