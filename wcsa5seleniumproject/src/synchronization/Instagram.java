package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dhanraj");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8625832505");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
	}

}
