package BasicTests;

public class class3 extends class4 {

	int b;

	public class3(int a) { // constructor
		super(a);
		this.b = a;
	}

	public int increment() {
		b = b + 1;
		return b;
	}

	public int decrement() {
		b = b - 1;
		return b;
	}
}
