package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {

	
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		// to call the webElement of login page create the object of loginPage class
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
//		lp.getUsnTB().sendKeys(flib.readPropertyData(PROP_PATH,"Username"));
//		lp.getPssTB().sendKeys(flib.readPropertyData(PROP_PATH,"pwd"));
//		lp.getLoginButton().click();
	}
}
