package collections;
import java.util.*;
public class Vectors {

	public static void main(String[] args) {
		Vector v1=new Vector<>();
		v1.addElement(9);
		v1.addElement(23);
		v1.addElement(64);
		v1.addElement(33);
		v1.addElement(75);
		v1.add(0, "ameen");
		v1.add(2, "harley");
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1.size());
		v1.remove(1);
		System.out.println(v1);
		System.out.println(v1.elementAt(2));
		System.out.println(v1.add(30));
		v1.removeAll(v1);
		System.out.println(v1);
		
	}

}
