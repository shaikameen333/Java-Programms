package ELF43;

public class SUPERFINAL extends SUPERFINAL1 {
	int a=100;
	int b=200;
	int c=300;
	int d=400;
	SUPERFINAL(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
	}
	
	void sudhu() {
		System.out.println("Hello sudarshan");
	}
public static void main(String[] args) {
	SUPERFINAL1 s1=new SUPERFINAL1();
	System.out.println(s1.a);
	System.out.println(s1.b);
	s1.sudhu();
}
	

}
