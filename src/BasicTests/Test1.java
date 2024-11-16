package BasicTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test(groups= {"Smoke"})
	public void Test() {
		System.out.println("Hi");
	}
	
	@BeforeTest
	public void Test2() {
		System.out.println("Bye");
	}
}
