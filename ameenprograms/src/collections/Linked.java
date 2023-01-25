package collections;
import java.util.*;
public class Linked {

	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	System.out.println(a1);
	a1.addFirst(33);
	a1.addLast(99);
	System.out.println(a1);
	a1.getFirst();
	System.out.println(a1.getFirst());
	System.out.println(a1.getLast());
	a1.removeFirst();
	a1.removeLast();
	System.out.println(a1);
		
	
	}

}
