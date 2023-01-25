package Interface;

public class Driver implements If1,If2{
   public void add() {
    	 System.out.println("Add numbers");
     }
     public void sub() {
    	 System.out.println("Subscration the numbers");
     }
     public void test() {
    	 System.out.println("hello world");
     }
      public void test2() {
    	 System.out.println("hello bangalore");
     }
      public static void main(String[] args) {
		Driver d1=new Driver();
		d1.add();
		d1.test();
	  System.out.println(If1.a);
	  System.out.println(If2.a);
	 
	  
	}
}
