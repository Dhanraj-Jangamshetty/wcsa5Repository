package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "Functional TestCase")
  public void ft1() {
	  Reporter.log("FTC1",true);
  }
  @Test(groups = "Smoke TestCase")
  public void st1() {
	  Reporter.log("STC1",true);
  }
  @Test(groups = "Intergration TestCase")
  public void it1() {
	  Reporter.log("ITC1",true);
  }
//  ---------------------------------------------------------------------------------------------------------
  @Test(groups = "Functional TestCase")
  public void ft2() {
	  Reporter.log("FRC2",true);
  }
  @Test(groups = "Smoke TestCase")
  public void st2() {
	  Reporter.log("STC2",true);
  }
  @Test(groups = "Intergration TestCase")
  public void it2() {
	  Reporter.log("ITC2",true);
  }
//  -----------------------------------------------------------------------------------------------------------
  @Test(groups = "Functional TestCase")
  public void ft3() {
	  Reporter.log("FRC3",true);
  }
  @Test(groups = "Smoke TestCase")
  public void st3() {
	  Reporter.log("STC3",true);
  }
  @Test(groups = "Intergration TestCase")
  public void it3() {
	  Reporter.log("ITC3",true);
  }
//  -----------------------------------------------------------------------------------------------------------
  @Test(groups = "Functional TestCase")
  public void ft4() {
	  Reporter.log("FRC4",true);
  }
  @Test(groups = "Smoke TestCase")
  public void st4() {
	  Reporter.log("STC4",true);
  }
  @Test(groups = "Intergration TestCase")
  public void it4() {
	  Reporter.log("ITC4",true);
  }
//  ----------------------------------------------------------------------------------------------------------
  @Test(groups = "Functional TestCase")
  public void ft5() {
	  Reporter.log("FRC5",true);
  }
  @Test(groups = "Smoke TestCase")
  public void st5() {
	  Reporter.log("STC5",true);
  }
  @Test(groups = "Intergration TestCase")
  public void it5() {
	  Reporter.log("ITC5",true);
  }
//  -----------------------------------------------------------------------------------------------------------
  @Test(groups = "Functional TestCase")
  public void ft6() {
	  Reporter.log("FRC6",true);
  }
  @Test(groups = "Smoke TestCase")
  public void st6() {
	  Reporter.log("STC6",true);
  }
  @Test(groups = "Intergration TestCase")
  public void it6() {
	  Reporter.log("ITC6",true);
  }
}
