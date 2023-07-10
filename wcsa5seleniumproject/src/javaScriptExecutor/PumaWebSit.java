package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PumaWebSit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch the webApplication
		driver.get("https://in.puma.com/in/en");
		//to perform scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//scroll down
		//jse.executeScript("window.scrollBy(0,650)");
		Thread.sleep(2000);
	    WebElement shoes = driver.findElement(By.xpath("(//img[@class='w-full bg-puma-black-800 aspect-1-1'])[1]"));
	    //to perform scrolling operation
	    //
	   
	}

}
