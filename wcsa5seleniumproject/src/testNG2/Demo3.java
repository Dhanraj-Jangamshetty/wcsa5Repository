package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	  public void method5() {
		  
		  Reporter.log("This is method5 class",true);
	  }
	  @Test
	  public void method6() {
		  
		  int i=4;
		  int j=15;
		  int res=j/i;
		  Reporter.log("This is method6 class",true);
	  }
	  
}