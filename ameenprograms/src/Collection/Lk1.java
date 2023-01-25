package Collection;

import java.util.LinkedList;

public class Lk1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList<>();
	l1.add(10);
	l1.add(50.5);
	l1.add("Ameen");
	System.out.println(l1);
	l1.addLast("Harley");
	System.out.println(l1);
	l1.addFirst(9);
	System.out.println(l1);
	l1.add(90.5);
	System.out.println(l1);
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	l1.removeFirst();
	l1.removeLast();
	System.out.println(l1);
}
}
