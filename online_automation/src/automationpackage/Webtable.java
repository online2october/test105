package automationpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhu\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the URL
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//create list of all companies
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("list of all companies: "+allcompanies.size());
		
		//create price list of all companies
				List<WebElement> allprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
				System.out.println("list of all companies: "+allprice.size());
				
				String expcompany = "Wardwizard Foods";
				for(int i=0;i<allcompanies.size();i++) {
					if(allcompanies.get(i).getText().equalsIgnoreCase(expcompany)) {
						System.out.println(allcompanies.get(i).getText()+ "===" + allprice.get(i).getText());
						Thread.sleep(2000);
						allcompanies.get(i).click();
						break;
					}
				}
		

	}

}
