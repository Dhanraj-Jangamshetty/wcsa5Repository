package methodsOfWebDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandelsMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		// get the handle or address of current or parent window
		String parentHandel = driver.getWindowHandle();	
		System.out.println("address of parent window :"+parentHandel);
		//launch the child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		//get the handle or address of child window only
		 Set<String> childHandle = driver.getWindowHandles();
		System.out.println("address of child window :"+childHandle);
		//read addresses by using looping statement
		for(String wh:childHandle)
		{
			System.out.println();	
		}
	}
}
