package Day3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNgTest3 {
	
	@Test
	public void login() {
		Assert.assertTrue(true);
		System.out.println("Login done");
		Reporter.log("Login Done",true);// to make report
	}
	
	@Test(dependsOnMethods = "login")
	public void logoutOnMethods() {
		System.out.println("Logout done");
	}

}
