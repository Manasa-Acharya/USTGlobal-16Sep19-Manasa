
public class TestA {
	public static int add(int a, int b) {

		System.out.println("add(int a, int b) method");
		return a+b;
		
	}
public static long add(long a, int b) {

	System.out.println("add(int a, int b) method");
	return a+b;
}
public int multipl(int a, int b) {
	System.out.println("multiply(int a, int b) method");
	return a+b;
}
public int multipl(byte a, int b) {
	System.out.println("multiply(int a, int b) method");
	return a+b;
}
public static void main(String[] args) {
	System.out.println("main(String[] args)");
	main(10);
	add(10,12);
	add(10, 20);
	add(98,59);
	TestA t = new TestA();
	t.multipl(12, 45);
	t.multipl(12, 34);
}

public static void main(int a) {
	System.out.println("main (int a) method");
}
}
