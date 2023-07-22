package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	//it is use the described the method or test case
  @Test(description = "login method")
  public void method1() {
	  Reporter.log("method1 from flag1");
  }
  
  
  @Test(description = "logOut method")
  public void method2() {
	  Reporter.log("method2 from flag1");
  }
}
