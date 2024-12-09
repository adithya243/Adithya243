package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script001 {
  @Test
  public  void Testcase1()
  {
	  Reporter.log("hello",true);
  }
  @Test
  public void test()
  {
	  System.out.println("test is pass");
  }
}
