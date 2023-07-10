package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadleDisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch the webApplication
		driver.get("file:///C:/Users/ak/Desktop/Link/disabledElement.html");
		//identify webElement
		driver.findElement(By.id("i1")).sendKeys("admin");
		//driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		//to handle disabled webElement
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//generate alert pop up
		jse.executeScript("alert('Hello There!!');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//handle disabled webElement
		jse.executeScript("document.getElementById('i2').value='manager'");
	}

}
