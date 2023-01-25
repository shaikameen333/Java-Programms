package Abstraction;

public class Ferari extends Car{
void enginecc() {
	System.out.println("10.99");
}
void carname() {
	System.out.println("Ferari");
}
void colour() {
	System.out.println("red");
}
public static void main(String[] args) {
	Ferari c1=new Ferari(); //Upcasting
	c1.carname();
	c1.colour();
	c1.enginecc();
	c1.tyres();
	c1.light();
	System.out.println(2);
	Car c2=new Honda();
	c2.carname();
	c2.colour();
	c2.enginecc();
	c2.tyres();
	c2.light();
}
}
