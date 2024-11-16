package BasicTests;

import org.testng.annotations.BeforeMethod;

public class class1 {
	
	//@Test
	public void test1() {
		System.out.println("Parent");
	}

	@BeforeMethod
	public void before() {
		System.out.println("first");
	}
}
