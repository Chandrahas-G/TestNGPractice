package BasicTests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {

	@Test(enabled=false)
	public void CarLoanMobile() {
		System.out.println("CarMobile");
	}
	
	@Test(groups= {"Smoke"})
	public void CarLoanWeb() {
		System.out.println("CarWeb");
	}
	
	@BeforeSuite
	public void CarLoanLogin() {
		System.out.println("CarLogin");
	}
	
	@Test
	public void CarLoanLogout() {
		System.out.println("CarLogout");
	}
}
