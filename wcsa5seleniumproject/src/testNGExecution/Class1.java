package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	  public void method1() throws InterruptedException {
		  
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://google.com/");
			driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
			Thread.sleep(2000);
			driver.quit();
			Reporter.log("This is Class1 class",true);
	  }
	}