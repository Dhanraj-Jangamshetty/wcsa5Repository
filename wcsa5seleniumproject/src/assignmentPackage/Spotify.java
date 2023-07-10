package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://accounts.spotify.com/en/login?continue=https");

		driver.findElement(By.id("login-username")).sendKeys("dhanraj170798@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("dhanraj@123");
		Thread.sleep(2000);
		driver.findElement(By.className("ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set")).click();
	}
}
