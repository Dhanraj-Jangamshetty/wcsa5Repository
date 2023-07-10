package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.zomato.com/india");
	    
	    //click on sign up link
	    driver.findElement(By.linkText("Sign up")).click();
	    Thread.sleep(2000);
	 // for Email textBox
	    driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 dFkpnp")).sendKeys("dg@gmail.com");
	    Thread.sleep(2000);
	    // for full name textBox
	    driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("Dhanraj");
	    
	     
	}

}
