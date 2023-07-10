package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneChatBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch blue stone
		driver.get("https://www.bluestone.com/");
		//handle hidden division pop up
		//driver.findElement(By.id("denyBtn"));
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		//handle the frame by switch the controls to frame ...
		//driver.switchTo().frame(5);1
		//driver.switchTo().frame("fc_widget");2
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));//3
		driver.switchTo().frame(frameElement);
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
		
		//switch the control again back to the main web page...
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("dhanraj");
		driver.findElement(By.id("chat-fc-email")).sendKeys("dhanrajjangamshetti@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("862582502");
		driver.findElement(By.xpath("//a[.='Start Chat']")).click();
		
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")))
//		driver.findElement(By.xpath("//iframe[@id='fc_widget']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("chat-fc-name")).sendKeys("Dhanraj");
//		Thread.sleep(2000);
//		driver.findElement(By.id("chat-fc-email")).sendKeys("dhanrajjangamshetti@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("chat-fc-phone")).sendKeys("862582502");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[.='Start Chat']")).click();
		

	}

}
