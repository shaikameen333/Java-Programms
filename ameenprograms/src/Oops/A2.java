
package Oops;

public class A2 extends A1 {
	int c=300;
	int d=4100;
	public static void main(String[] args) {
		A1 a1=new A1();
		A2 a3=new A2();
     	a1=a3;
		
		A2 a2=(A2) a1;
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a2.c);
		System.out.println(a2.d);
	}
}



