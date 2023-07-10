package dropDownMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ak/Desktop/Link/SingleSelectDropdown.html");
		//identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		//handle the deopdown
		Select sel = new Select(dropDownElement);
		//select multiple options form dropdwon
		for(int i=0; i<=4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		//to read all selected options from dropDown
		List<WebElement> allOpts = sel.getAllSelectedOptions();
		//to read the list of webelement we use loop
//		for(WebElement op:allOpts)
//		{
//			Thread.sleep(2000);
//			System.out.println(op.getText());
//		}
		for(int i=0;i<allOpts.size();i++)
		{
			Thread.sleep(2000);
			System.out.println(allOpts.get(i).getText());
//			WebElement op = allOpts.get(i);
//			String value = op.getText();
		}
		
	}

}
