public class Derived extends Base {
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	public void print() {
		// super.print();

		System.out.println("Non-static or instance method from Derived");
	}
}