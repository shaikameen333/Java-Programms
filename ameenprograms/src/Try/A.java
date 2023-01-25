package Try;

public class A {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		try {
			System.out.println(a / 0);
		} catch (Exception e) {
			System.out.println("Exception handaled");

		} finally {
			System.out.println("Finally block executed");
		}

	}

}
