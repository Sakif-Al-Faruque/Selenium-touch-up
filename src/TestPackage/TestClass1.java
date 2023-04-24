package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//showing the element name
		String tagname1 = driver.findElement(By.cssSelector("#searchDropdownBox > option:nth-child(1)")).getText();
		System.out.println(tagname1);
		
		//hover over the search dropbox element.
		WebElement tagname = driver.findElement(By.cssSelector("#searchDropdownBox"));

		Actions action = new Actions(driver);
		action.moveToElement(tagname).perform();
		
		Thread.sleep(5000);
		
	}

}
