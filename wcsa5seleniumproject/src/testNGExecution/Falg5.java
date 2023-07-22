package testNGExecution;

import org.testng.annotations.Test;

public class Falg5 {
  @Test
  public void loginMethod() {
	  System.out.println("it is use to perform login");
  }
  
  @Test (dependsOnMethods = "loginMethod")
  public void createUserMethod() {
	  System.out.println("it is use to creat User");
  }
  
  @Test(dependsOnMethods = "createUserMethod")
  public void logoutMethod() {
	  System.out.println("it is use to perform logout");
  }
  
}
