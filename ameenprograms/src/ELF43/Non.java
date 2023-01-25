package ELF43;

import ameenprograms.main;

public class Non {
	static {
		System.out.println(1);
	}
	static {
		System.out.println(2);
	}
	Non(){
		System.out.println(3);
	}
	Non(int a){
		System.out.println(4);
	}
	{
		System.out.println(5);
	}
	{
		System.out.println(6);
	}
	{
		System.out.println(7);
	}
  static	{
		System.out.println(8);
	}
	
	public static void main(String[] args) {
		System.out.println(9);
		Non n1=new Non();
		System.out.println(10);
}
}
