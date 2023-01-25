package MethodoverRiding;

public class B extends A {
	void test() {
		System.out.println("hello sub class test");
	}
	void test(int a) {
		System.out.println("hello Sub class test number");
	}
	void test3(String s1) {
		System.out.println("Hello sub class Test yantra");
	}
   public static void main(String[] args) {
	A obj=new A();
//	B obj1=new B();
   // obj.test();
//	obj1.test();
	//obj=obj1;
	//B b1=(B)obj;
	obj.test();
   obj=new B();
   B obj2=(B)obj;
//	obj.test();
}
}
