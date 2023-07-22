package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	  public void method2() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://google.com/");
			driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
			Thread.sleep(2000);
			driver.quit();
			Reporter.log("This is class2 class",true);
	  }
	}