package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test( description = "login method!!",enabled = true)
  public void method1() {
	  Reporter.log("method1 from flag2",true);
  }
  @Test(description = "logout method!!",enabled = true)
  public void method2() {
	  Reporter.log("method2 from flag2",true);
  }
}
