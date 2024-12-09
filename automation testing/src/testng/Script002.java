package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Script002 {
     //private static final String[]  = null;
	@Test(priority=0)
     public void signup()
     {
    	 System.out.println("signup is successful");
     }
    @Test(dependsOnMethods ="signup")
     public void login()
     {
    	Assert.fail();
    	 System.out.println("login is suucefull");
     }
     @Test(dependsOnMethods ="login")
     public void homepage()
     {
    	 System.out.println("homepage is suucefull");
     }
     @Test(enabled=false)
     public void logout()
     {
    	 System.out.println("logout is suucefull");
     }
}
