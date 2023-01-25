package Collection;

import java.util.Vector;

public class Vk1 {
public static void main(String[] args) {
	Vector v1=new Vector<>();
	v1.add(20);
	v1.addElement(25.9);
	v1.add(1,"Ameen");
	v1.add("david");
	System.out.println(v1 );
	System.out.println(v1.elementAt(0));
}
}
