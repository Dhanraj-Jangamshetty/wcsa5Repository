package robotAction;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class Robot2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe");
		 EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.");
	}

}
