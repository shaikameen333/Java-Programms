package ELF43;

public class Staticblock {
	static int a;
	static {
		a=30;
	}
	static {
		a=40;
	}
	public static void main(String[] args) {
	System.out.println(a++);
	apple();
	System.out.println(Staticblock.a);
	}
	static void apple(){
	System.out.println(a++);
	}
	
	}


