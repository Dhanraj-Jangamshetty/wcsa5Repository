package scenarioPiyushSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch blue stone
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//span[@class='prcs-d' and @data-p='offers,m']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='25% Off your first Gold Mine installment']")).click();
		if(driver.findElement(By.xpath("//strong[text()='25% DISCOUNT ']")).isDisplayed())
		{
			
			System.out.println("25% discount is displayed");
			driver.quit();
		}
		else
		{
			System.out.println("exception");
		}
			
		}
	}


