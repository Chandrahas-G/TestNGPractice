package BasicTests;

import org.testng.annotations.Test;

public class class2 extends class1 {

	@Test
	public void test2() {
		// System.out.println("Child");
		test1();
		int a = 2;
		class3 A = new class3(a); // parameterized constructor
		System.out.println(A.increment());
		System.out.println(A.decrement());
		System.out.println(A.multiply2());
		System.out.println(A.multiply3());
	}
}
