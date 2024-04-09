package automationpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
			Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		
	
		//1st way
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//2nd way
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total radio button :"+radios.size());
		System.out.println(radios.get(0).isSelected());//false
		System.out.println(radios.get(1).isDisplayed());//true
		System.out.println(radios.get(2).isEnabled());//true
		Thread.sleep(2000);
		radios.get(1).click();
		Thread.sleep(2000);
		System.out.println(radios.get(2).isSelected());
		
		//3rd way
		List<WebElement> radiotext= driver.findElements(By.xpath("//label[@class='_58mt']"));
 		System.out.println("total no of radio button is :"+radiotext.size()); //3
 		String expresult="Female";
 		for(int i=0; i< radiotext.size();i++)
 		{
 			if(radiotext.get(i).getText().equalsIgnoreCase(expresult))
 			{
 				radiotext.get(i).click();
 				System.out.println(expresult+  "clicked");
 				break;
 			}
 		}

	}

}
