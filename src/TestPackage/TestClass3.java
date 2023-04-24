package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestClass3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://fontawesome.com/");
		//driver.quit();
		
		driver.get("https://www.amazon.com/Harry-Potter-Coloring-Book-Scholastic/dp/1338029991/ref=sr_1_2?crid=250OQF1JB4VBO&keywords=harry+potter&qid=1682309180&s=books&sprefix=harry%2Cstripbooks-intl-ship%2C557&sr=1-2");
		driver.manage().window().maximize();
		
		//
		
		//checking cart button
		WebElement cartBtn = driver.findElement(By.cssSelector("#add-to-cart-button"));
		Actions action = new Actions(driver);
		action.moveToElement(cartBtn);
		action.click();
		action.perform();
		Thread.sleep(5000);
		
	}

}