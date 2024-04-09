package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome driver and passing chromedriver path
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//open the URL
				driver.get("https://paytm.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//span[text()='Sign In']")).click();
				Thread.sleep(2000);
				//find the total frame present in webpage
				int allframe= driver.findElements(By.tagName("iframe")).size();
				System.out.println("total no of frame" +allframe);
				
				//check if the element present or not
				for(int i=0;i<allframe;i++)
				{
					driver.switchTo().frame(i);
					driver.switchTo().frame(i);
					
					String exptest = "Open Paytm App";
					String abc = driver.findElement(By.xpath("//span[text()='Open Paytm App']")).getText();
					if(abc.equalsIgnoreCase(exptest))
					{
						System.out.println("element found ");
					}
					else {
						System.out.println("element not found");
					}
				}
				
	}

}
