package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	  public void method3() {
		  
		  Reporter.log("This is method3 class",true);
	  }
	  @Test
	  public void method4() {
		  
		  Reporter.log("This is method4 class",true);  
	  }
	  
	}