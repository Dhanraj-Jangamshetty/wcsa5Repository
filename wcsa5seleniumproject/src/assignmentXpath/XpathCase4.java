package assignmentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[contains(@name,'me')]")).sendKeys("dhanraj@123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[contains(@type,'word)]")).sendKeys("8625832505");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Log in')])]")).click();
		 
	}

}
