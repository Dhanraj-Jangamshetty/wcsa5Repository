package popUpHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://omayo.blogspot.com/");
		 Actions act = new Actions(driver);
		 WebElement uploadButton = driver.findElement(By.id("uploadfile"));
		 act.click(uploadButton).perform();
		 
		 Runtime.getRuntime().exec("./autoItPrograms/OmayoFileUpload.exe");
		 Thread.sleep(2000);
		 driver.quit();
		 		
	}

}
