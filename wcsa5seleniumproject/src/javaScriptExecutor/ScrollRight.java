package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch the webApplication
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//to perform scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//scroll right
		jse.executeScript("window.scrollBy(5000,0)");
		//scroll left
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-10000,0)");
		Thread.sleep(2000);
		driver.close();
	}

}
