package assignmentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9552265154");
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9421030378");
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
