package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		
		//it is use to send inputs to text box and active element
		
		System.setProperty("webdriver.chrome.driver","./driverrs/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usn = driver.findElement(By.name("username"));       //1
		usn.sendKeys("admin");
		
		driver.findElement(By.name("username")).sendKeys("admin");      //2
	}	
}


