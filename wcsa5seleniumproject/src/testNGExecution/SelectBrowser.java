package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","Vusername","Vpassword"})
  public void testParallelMethod(String browerValue, String url, String usn, String pss) {
	  
	  if (browerValue.equalsIgnoreCase("chrome") ) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(url);
		 driver.findElement(By.name("username")).sendKeys(usn);
		 driver.findElement(By.name("pwd")).sendKeys(pss);
		 driver.findElement(By.id("loginButton")).click();
		 driver.quit();
	  }
	  else if (browerValue.equalsIgnoreCase("FireFox") ) {
			 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 driver =new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(url);
			 driver.findElement(By.name("username")).sendKeys(usn);
			 driver.findElement(By.name("pwd")).sendKeys(pss);
			 driver.findElement(By.id("loginButton")).click();
			 driver.quit();
	  }
  }
}

