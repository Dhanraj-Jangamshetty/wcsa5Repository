package robotAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch blue stone
		driver.get("https://www.bluestone.com/");
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		//move to watch jewellery
	    Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(4000);
		//click an hold filter by text
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		
		for(int i=1;i<=2;i++)
		{
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();	
		}
		Thread.sleep(4000);
		//copy the filter by text
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		//identify the search box
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		//paste the filter by text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		//hit enter button 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);
//		driver.close();
		
		if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
    {
    	Thread.sleep(4000);
		driver.quit();
	}
    else
    {
    	System.out.println("Exceptin!!");
    }	
	}
}