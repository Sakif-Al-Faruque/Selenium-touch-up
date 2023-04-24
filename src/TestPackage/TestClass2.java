package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://fontawesome.com/");
		//driver.quit();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		//click on the search bar
		WebElement tagname = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.moveToElement(tagname);
		action.click();
		action.perform();
		Thread.sleep(5000);
		
		//give input to the search bar
		tagname.sendKeys("harry potter");
		
		//search the item
		WebElement searchBtn = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		searchBtn.click();
		//driver.close();
	}

}