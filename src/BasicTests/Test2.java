package BasicTests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeClass
	public void Classfirst() {
		System.out.println("Class 1st");
	}
	@AfterMethod
	public void PersonalLoanMobile() {
		System.out.println("PLMobile");
	}
	
	@Test(groups= {"Smoke"})
	public void PersonalLoanWeb() {
		System.out.println("PLWeb");
		//Assert.assertTrue(false);
	}
	
	@Test(alwaysRun = true)
	public void Login() {
		System.out.println("PLLogin");
	}
	
	@AfterTest
	public void PersonalLoanLogout() {
		System.out.println("PLLogout");
	}
}
