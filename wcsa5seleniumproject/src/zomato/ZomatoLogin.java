package zomato;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/ncr/golf-course-order-online");
		
		driver.findElement(By.className("sc-60vv3c-0 eOYJSt sc-fznyAO CWQMf")).sendKeys("8625832505");
		driver.findElement(By.className("sc-1kx5g6g-3 gXvQtR")).click();
	}

}
