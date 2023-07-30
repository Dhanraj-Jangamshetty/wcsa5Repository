package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserWithoutQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		Point elementLoc = childWindow.getLocation();
		int xaxis = elementLoc.getX();
		int yaxis = elementLoc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
	}

}
