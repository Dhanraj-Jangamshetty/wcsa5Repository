package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoldCoin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
		driver.findElement(By.xpath("//span[text()='1 gram' and @data-p='gold-coins-weight-1gms,m']")).click();
		//driver.findElement(By.id("details-top-right"));
		driver.findElement(By.id("5920"));
		if(coins.isDisplayed())
		{
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.out.println("exception");
		}
		
		
		
		//WebElement target = driver.findElement(By.id("goldCoins"));
		//Actions act = new Actions(driver);
		//act.moveToElement(target).perform();
		//driver.findElement(By.xpath("//span[text()='1 gram' and @data-p='gold-coins-weight-1gms,m']")).click();
	
//		  boolean image = driver.findElement(By.id("details-top-right")).isDisplayed();
//		
//	 	  System.out.println(image);
	}

}
