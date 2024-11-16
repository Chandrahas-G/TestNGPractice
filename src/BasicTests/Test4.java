package BasicTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {

	@AfterClass
	public void ClassLast() {
		System.out.println("Class Last");
	}
	
	@Test(groups= {"Smoke"})
	public void HomeLoanMobile() {
		System.out.println("HomeMobile");
	}
	
	@BeforeMethod
	public void HomeLoanWeb() {
		System.out.println("HomeWeb");
	}
	
	@AfterSuite
	public void HomeLoanLogin() {
		System.out.println("HomeLogin");
	}
	
	@Test
	public void Z() {
		System.out.println("zzzzzzzzzzzzzz");
	}
	
	@Test(dependsOnMethods = {"Z"})
	public void HomeLoanLogout() {
		System.out.println("HomeLogout");
	}
}
