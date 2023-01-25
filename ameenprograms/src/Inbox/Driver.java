package Inbox;

public class Driver {
	public static void main(String[] args) {
		Enjoy e1=new Enjoy();
		A a1=new A();
		e1.via(a1);
		A a2=new B();
		e1.via(a2);
		A a3=new C();
		e1.via(a3);
		
	}

}
