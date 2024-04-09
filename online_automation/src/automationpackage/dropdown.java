package automationpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

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
					List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
					System.out.println("The month of list are: "+birthmonth.size());
					birthmonth.get(8).click();
					
					//2nd way
					WebElement bm= driver.findElement(By.xpath("//select[@id='month']"));
					Select month=new Select(bm);
					month.selectByVisibleText("Apr");//April
					Thread.sleep(2000);
					month.selectByIndex(5);//june
					Thread.sleep(2000);
					month.selectByValue("12");//december
					System.out.println(month.getFirstSelectedOption().getText()); //dec current selected value
					
							//3rd way
					List<WebElement> dropdown = month.getOptions();
					for(int i=0;i<dropdown.size();i++)
					{
						if(dropdown.get(i).getText().equalsIgnoreCase("sep"))
						{
							dropdown.get(i).click();
						}
					}

	}

}
