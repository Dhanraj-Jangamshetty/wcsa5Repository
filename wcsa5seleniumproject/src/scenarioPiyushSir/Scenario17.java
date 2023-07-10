package scenarioPiyushSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch blue stone
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[.='Coins ']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='5 gram'])[3]")).click();
		if(driver.findElement(By.xpath("//h1[.='5 gram 24 KT Lakshmi Gold Coin']")).isDisplayed())
		{
			
			System.out.println("5gm 24 KT Laxmi coin is displayed");
			driver.quit();
		}
		else
		{
			System.out.println("exception");
		}

	}

}
