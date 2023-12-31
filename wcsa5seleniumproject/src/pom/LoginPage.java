package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		// it is a webElement repository
		@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
		@FindBy(xpath="//*[@name='pwd']") private WebElement pssTB;
		@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement LoginButton;
		@FindBy(id ="keepLoggedInCheckBox") private WebElement checkBox;
		@FindBy(partialLinkText="Actimind Inc.") private WebElement actiMind;
		
		//intialization
		public LoginPage(WebDriver driver) {
			
			PageFactory.initElements( driver,this);
		}
		//utilaization read that WebElemetns
		public WebElement getUsnTB() {
			return usnTB;
		}

		public WebElement getPssTB() {
			return pssTB;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		}

		public WebElement getCheckBox() {
			return checkBox;
		}

		public WebElement getActiMind() {
			return actiMind;
		}
		
		
		
		//
		public void validLoginMethod(String validUsername, String validPassword)
		{
			usnTB.sendKeys(validUsername);
			pssTB.sendKeys(validPassword);
			LoginButton.click();
		}
	
}



