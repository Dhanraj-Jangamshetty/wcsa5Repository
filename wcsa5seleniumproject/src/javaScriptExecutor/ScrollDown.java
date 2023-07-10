package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch the webApplication
		driver.get("https://www.selenium.dev/");
		//to perform scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//scroll down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1000)");
		
		//to perform scroll up , first we need to do to do scroll down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");
		
		driver.findElement(By.xpath("//a[contains(@class,'selenium-button selenium-id')]")).click();
		
	}

}
