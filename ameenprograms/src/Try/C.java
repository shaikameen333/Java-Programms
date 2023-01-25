package Try;

public class C {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	add();
	
}
public static void add() {
	System.out.println(1/0);
}
public static void sub() {
	System.out.println("Hello world");
}
}
