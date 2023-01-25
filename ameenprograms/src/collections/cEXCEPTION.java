package collections;

import java.util.Scanner;

public class cEXCEPTION {

	public static void main(String[] args) {
		int a=10;
		int b=2;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arthimatic exception handled");
		}
		finally {
			System.out.println("finally block executed");
		}
	}
}