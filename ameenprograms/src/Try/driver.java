package Try;

import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		try {
			sub();
		}
		catch(Exception e) {
			System.out.println("bye");
		}
		
	}
	public static void add() {
		System.out.println(1);
	}
	public static void sub() throws NullPointerException {
		int a[]=null;
		System.out.println(a[1]);
	}
	public static void multy() {
		System.out.println(3);
	}
	
}
