package sample;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;


public class ToLaunchChromeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension size = new Dimension(400,500);
		driver.manage().window().setSize
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
