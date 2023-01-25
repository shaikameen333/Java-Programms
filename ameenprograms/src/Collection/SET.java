package Collection;

import java.util.HashSet;

public class SET {
	public static void main(String[] args) {
		HashSet h1=new HashSet<>();
		h1.add(10);
		h1.add(30);
		h1.add(10);
		h1.add(10);
		h1.add(true);
		h1.add("hello");
		h1.add('A');
		System.out.println(h1);
		for(Object var:h1) {
			System.out.println(var);
		}
	}
}
